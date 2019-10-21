package fr.dauphine.ja.pachoudalexandre.model;

import java.awt.Graphics;
import java.util.*;

import fr.dauphine.ja.pachoudalexandre.model.Point;

public class LigneBrisee implements Drawable {
	private LinkedList<Point> listePoint;
	private final int max;
	
	public LigneBrisee(int max){
		listePoint=new LinkedList<>();
		this.max=max;
	
	}
	public boolean add(Point p){
		if(listePoint.size()<max){
			listePoint.add(p);
		}
		else{
			return false;
		}
		
		return true;
	}

	public int pointCapacity(){return this.max;}
	public int nbPoints(){return this.listePoint.size();}
	public boolean contains(Point p){
		return listePoint.contains(p);
	}
	@Override
	public void drawOn(Graphics g) {
		Point p2=null;
		for(Point p1 : this.listePoint) {
			System.out.println(p1 +"&"+ p2);
			if(p2!=null) {
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
			}
			p2=p1;
		}
		
	}
}
