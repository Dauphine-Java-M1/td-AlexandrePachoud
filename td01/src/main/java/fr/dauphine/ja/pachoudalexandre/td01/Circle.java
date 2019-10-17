package fr.dauphine.ja.pachoudalexandre.td01;

public class Circle {
	Point center;
	Integer rayon;
	
	//CONSTRUCTEURS
	public Circle(Point p, Integer r) {
		center=p;
		rayon=r;
	}
	public Circle() {
		this(new Point(), 1);
	}
	
	@Override
	public String toString() {
		return (center.toString()+" - "+rayon);
	}
	
	public void translate(Integer dx, Integer dy) {
		center.translate(dx, dy);
	}
	
	public boolean contains(Point p) {
		return( Math.pow(p.x-center.x,2)+Math.pow(p.y-center.y,2) <= Math.pow(rayon, 2) );
	}
	public static boolean contains(Point p,  Circle ... circles) {
		for(Circle c : circles) {
			if(c.contains(p))return true;
		}
		return false;
	}
}

