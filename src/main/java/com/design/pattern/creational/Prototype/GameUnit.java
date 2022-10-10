package com.design.pattern.creational.Prototype;


public abstract class GameUnit implements Cloneable{
	private  Double position;
	
	public GameUnit() {
		position = 0.0;
	}
	
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit = (GameUnit)super.clone();
		unit.initialize();
		return unit;
	}

	protected void initialize() {
		this.position = 0.0;
		reset();
	}
	
	protected abstract void reset();
	
	public GameUnit(float x, float y, float z) {
		position = (double)x;
	}

	public void move(Double direction, float distance) {
		position = position + (direction*distance);
	}
	
	public Double getPosition() {
		return position;
	}
}
