package fr.dauphine.ja.pachoudalexandre.td01;

import java.util.*;


public class Point{
	
	//ATTRIBUTS
	private final Integer x , y ;
	private static Integer compteur=0;
	
	//CONSTRUCTEURS
	public Point(Integer x,Integer y){
		this.x=x;
		this.y=y;
		compteur++;
	}
	public Point()			{this(0,0);}
	public Point(Point p)	{this(p.x,p.y);}
	
	
	//METHODES
	public boolean equals(Point p){
		return (p.x.equals(this.x) && p.y.equals(this.y));
	}
	
	
	
}
