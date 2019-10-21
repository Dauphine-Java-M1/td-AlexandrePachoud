package fr.dauphine.ja.pachoudalexandre.view;


import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;
import fr.dauphine.ja.pachoudalexandre.model.Circle;
import fr.dauphine.ja.pachoudalexandre.model.Drawable;
import fr.dauphine.ja.pachoudalexandre.model.LigneBrisee;
import fr.dauphine.ja.pachoudalexandre.model.Point;
import fr.dauphine.ja.pachoudalexandre.model.Ring;

public class MyDisplay extends JPanel {

	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(0, 0,super.size().width, super.size().height);
		
		Drawable d;
		d=new Circle(200,200,70);
		d.drawOn(g);
		
		LigneBrisee lb = new LigneBrisee(30);
		Random r =new Random();
		for(int i=0; i<7; i++) {
			Point point=new Point(r.nextInt()%100+ 100 ,r.nextInt()%100+ 300) ;
			System.out.println(point);
			lb.add(point);
		}
		d=lb;
		g.drawRect(0, 200, 200, 200);
		d.drawOn(g);
		
		Ring rg = new Ring(400,400,50,75);
		d=rg;
		d.drawOn(g);
		
		
		
		
	}
	
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancee - Graphic Display");
		frame.setSize(new Dimension(800,800));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
		frame.setBackground(Color.WHITE);
	}
}

