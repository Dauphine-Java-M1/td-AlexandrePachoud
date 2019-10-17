package fr.dauphine.ja.pachoudalexandre.td01;

import java.util.*;
import fr.dauphine.ja.pachoudalexandre.td01.Point;

public class LigneBrisee{
	private ArrayList<Point> listePoint;
	private final int max;
	
	public LigneBrisee(int max){
		listePoint=new ArrayList<>();
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
		
		for(Point i = listePoint){
			if(i.equals(p)) return true;
		}
		 	
		return false;
		
		
	}
	
	public static void main( String[] args ){
	 
	 	Point p1,p2,p3,p4;
	 	
		p1=new Point(1,2);
		p2=p1;
		p3=new Point(1,2);
		
		
		
		
	}
	
	 
}
