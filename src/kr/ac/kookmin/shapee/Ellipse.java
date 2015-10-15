package kr.ac.kookmin.shapee;

import kr.ac.kookmin.shapee.Graphics;
import kr.ac.kookmin.shapee.Point;
import kr.ac.kookmin.shapee.Rectangle;
import kr.ac.kookmin.shapee.Shape;

public class Ellipse extends Shape{
	//Implement here
	int w,h;
	
	protected Ellipse(Point center, int w, int h){
		super(center);
		this.w=w;
		this.h=h;
	}

        public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}
	public int getSemiMajorAxis(){
		return 0;
	}
	public int getSemiMinorAxis(){
		return 0;
	}
	}

