package com.ofss.parent;

public class Vehicle {

	
	private String engine;
	private int wheels;
	
	public Vehicle(){
		this.engine="Petrol";
		this.wheels=2;
		System.out.println("Coming to Parent");
	}
public Vehicle(String str){
		
		System.out.println(str);
	}
public Vehicle(String engine, int wheels) {
	//super();
	this.engine = engine;
	this.wheels = wheels;
}

public int getWheels() {
	return wheels;
}

public String getEngine() {
	return engine;
}
@Override
public String toString() {
	return "Parent TO STRING";
}

}
