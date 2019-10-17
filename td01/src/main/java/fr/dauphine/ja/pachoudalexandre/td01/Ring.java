package fr.dauphine.ja.pachoudalexandre.td01;

public class Ring extends Circle {
	Integer rayonInterne;
	
	public Ring(Point p, Integer r,Integer r2){
		super(p,r);
		rayonInterne=r2;
	}
	public Ring(){
		super();
		rayonInterne=0;
	}
}
