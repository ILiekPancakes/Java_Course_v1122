package Lab20;

import java.awt.Color;

public class pinBall extends Spot{
	private double dx, dy;
	private int rightEdge, bottomEdge;
	
	public pinBall(int x, int y, int r, Color c) {
		super(x, y, (int) r, c);
		dx = Math.random() * 12 - 6;
		dy = Math.random() * 12 - 6;
	}
	
	public void setbound(int right, int bottom) {
		rightEdge = right;
		bottomEdge = bottom;
		
	}
	
	private int littlerandom() {
		return (int)(Math.random() * 6 + 1);
	}
	
	public void tick() {
		
		if(getX() >= rightEdge - getR()) {
			dx = (dx/Math.abs(dx) * littlerandom()) * -1;
			setX(rightEdge - getR());
		}
		
		if(getX() <= getR()) {
			dx = (dx/Math.abs(dx) * littlerandom()) * -1;
			setX(getR());
		}
		
		if(getY() >= bottomEdge - getR()) {
			dy = (dy/Math.abs(dy) * littlerandom()) * -1;
			setY(bottomEdge - getR());
		}
		
		if(getY() <= getR()) {
			dy = (dy/Math.abs(dy) * littlerandom()) * -1;
			setY(getR());
		}
		
		setX(getX() + dx);
		setY(getY() + dy);
	}
}
