package com.ofss.vehickes;

import com.ofss.parent.Vehicle;

public class Bike extends Vehicle {

	public Bike() {
		
		super("Parametrized Constructor");
		System.out.println("Going to Bike Constructor 1");
		System.out.println("Going to Bike Constructor 2");
		this.handle="Long";
	}
	{
		System.out.println("Going to Bike Block1");
	
		System.out.println("Going to Bike Block2");
	}
	private String  handle ;
	public Bike(String handle) {
		super();
		this.handle = handle;
	}
	public Bike(String handle,String engine, int wheels) {
		super(engine, wheels);
		// TODO Auto-generated constructor stub
		
		this.handle = handle;
	}
	public String getHandle() {
		return handle;
	}
	@Override
	public String toString() {
		return "Bike [handle=" + handle + ", getHandle()=" + getHandle() + ", getWheels()=" + getWheels()
				+ ", getEngine()=" + getEngine() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
