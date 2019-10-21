package fr.dauphine.ja.pachoudalexandre.td01;

public class Ring extends Circle {
	private Integer rayonInterne;
	
	public Integer getRayonInterne() {
		return rayonInterne;
	}
	public Ring(Point p, Integer r,Integer r2){
		super(p,Math.max(r, r2));
		rayonInterne=Math.min(r, r2);
	}
	public Ring(){
		super();
		rayonInterne=0;
	}
	public boolean equals(Ring obj) {
		return super.equals(obj) && this.rayonInterne.equals(obj.getRayonInterne()) ;	
	}
	@Override
	public String toString() {
		return (super.toString() + " rayon interne:"+rayonInterne.toString());
	}
	
	public static void main(String[] args) {
		Ring ring = new Ring();
		System.out.println(ring);
	}
	@Override
	public boolean contains(Point p) {
		Circle cercle  = new Circle(super.center,this.rayonInterne);
		return (super.contains(p) && !cercle.contains(p) );
	} 
	public static boolean contains(Point p,  Ring ... rings) {
		for(Circle r : rings) {
			if(r.contains(p))return true;
		}
		return false;
	}
}
