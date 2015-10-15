package kr.ac.kookmin.shapee;

import kr.ac.kookmin.shapee.Graphics;
import kr.ac.kookmin.shapee.Point;
import kr.ac.kookmin.shapee.Rectangle;
import kr.ac.kookmin.shapee.Shape;

public class Rectangle extends Shape{
	//Implement here
	private int h,w;
	
	public Rectangle(Point center, int w, int h){
		super(center);
		this.h=h;
		this.w=w;
	}
	public int getHeight() {
		return h;
	}
	public int getWidth() {
		return w;
	}
	public Rectangle getBounds() {
		return this;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}

}