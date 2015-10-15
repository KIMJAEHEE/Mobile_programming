package kr.ac.kookmin.shapee;

import java.util.LinkedList;

import kr.ac.kookmin.shapee.Ellipse;
import kr.ac.kookmin.shapee.Graphics;
import kr.ac.kookmin.shapee.Point;
import kr.ac.kookmin.shapee.Rectangle;
import kr.ac.kookmin.shapee.Shape;

public class Test {
	
	static void paintShapes(Graphics g, LinkedList<Shape> shapes) {
		for(Shape s : shapes) {
			s.draw(g);
		}
	}
	
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(new Point(1, 1), 5, 3);
		Ellipse ellipse = new Ellipse(new Point(2, 2), 3, 2);
		
		LinkedList<Shape> shapes = new LinkedList<Shape>();
		shapes.add(rectangle);
		shapes.add(ellipse);
		
		Graphics g = new Graphics();
		paintShapes(g, shapes);
	}
}
