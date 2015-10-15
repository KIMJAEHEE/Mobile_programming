package kr.ac.kookmin.shapee;

import kr.ac.kookmin.shapee.Graphics;
import kr.ac.kookmin.shapee.Point;
import kr.ac.kookmin.shapee.Rectangle;

public abstract class Shape {
    protected Point center;
//Implement here
    
    protected Shape(Point center){
    	this.center=center;
    }
    
    public abstract Rectangle getBounds();
    
    public Point getCenter(){
    	return center;
    }
    public abstract void draw(Graphics g) ;
}

