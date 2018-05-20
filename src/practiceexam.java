package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class practiceexam {
	public static void main(String[] args) {
		
	


 Robot Nathaniel = new Robot();
 ;
String color = JOptionPane.showInputDialog("What color do you want?");
String shapes = JOptionPane.showInputDialog("How many shapes do you want");
if(shapes.equals("2"))
	 Nathaniel.penDown();
Nathaniel.setPenWidth(10);
	Nathaniel.turn(90); 
Nathaniel.move(100);
Nathaniel.turn(90);
Nathaniel.move(100);
Nathaniel.turn(90);
Nathaniel.move(100);
Nathaniel.move(100);
Nathaniel.turn(90); 
Nathaniel.move(100);
Nathaniel.turn(90);
Nathaniel.move(100);
Nathaniel.turn(90);
Nathaniel.move(100);
 if (color.equals("red")) {
	 Nathaniel.setPenColor(Color.red);
	 Nathaniel.penDown();
	 Nathaniel.setPenWidth(10);
	 Nathaniel.move(100);
	 
 Nathaniel.turn(90); 
 Nathaniel.move(100);
 Nathaniel.turn(90);
 Nathaniel.move(100);
 Nathaniel.turn(90);
 Nathaniel.move(100);
	}
 //
 if (color.equals("blue")) {
	 Nathaniel.setPenColor(Color.blue);
	 Nathaniel.penDown();
	 Nathaniel.setPenWidth(10);
	 Nathaniel.move(100);
	 Nathaniel.turn(90); 
	 Nathaniel.move(100);
	 Nathaniel.turn(90);
	 Nathaniel.move(100);
	 Nathaniel.turn(90);
	 Nathaniel.move(100);
		}
 
	}
}
 
	

