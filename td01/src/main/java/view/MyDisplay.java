package view;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class MyDisplay extends JPanel {

	
	
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancee - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
	}
}
