package fr.dauphine.ja.pachoudalexandre.model;

import java.awt.Graphics;

public class Ring extends Circle implements Drawable{
	
	//VARIABLES
	private Integer rayonInterne;
	
	
	
	
	//GET
	public Integer getRayonInterne() {
		return rayonInterne;
	}
	
	
	
	//CONTSRUCTEURS
	public Ring(Point p, Integer r,Integer r2){
		super(p,Math.max(r, r2));
		rayonInterne=Math.min(r, r2);
	}
	public Ring(int x, int y, Integer r,Integer r2){
		this(new Point(x,y),r,r2);
	}
	public Ring(){
		super();
		rayonInterne=0;
	}
	
	
	
	//METHODES
	public boolean equals(Ring obj) {
		return super.equals(obj) && this.rayonInterne.equals(obj.getRayonInterne()) ;	
	}
	@Override
	public String toString() {
		return (super.toString() + " rayon interne:"+rayonInterne.toString());
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
	
	@Override
	public void drawOn(Graphics g) {
		super.drawOn(g);
		new Circle(super.center,this.rayonInterne).drawOn(g);
	}
}
