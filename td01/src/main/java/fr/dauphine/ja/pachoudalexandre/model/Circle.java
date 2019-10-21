package fr.dauphine.ja.pachoudalexandre.model;

import java.awt.Graphics;

public class Circle implements Drawable {
	Point center;
	Integer rayon;
	
	//CONSTRUCTEURS
	public Circle(Point p, Integer r) {
		center=p;
		rayon=r;
	}
	public Circle(int x, int y, int r) {
		this(new Point(x,y), r);
	}
	public Circle() {
		this(new Point(), 1);
	}
	
	@Override
	public String toString() {
		return ("center:"+center.toString()+" rayon:"+rayon);
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
	@Override
	public void drawOn(Graphics g) {
		g.drawOval(center.x-rayon, center.y-rayon, 2*rayon, 2*rayon);
	}
}

