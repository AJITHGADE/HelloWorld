package com.ofss;

public class Car {

	private String doors;
	private String driver;
	private int speed;
	private String engine;
	
	
	public Car(String doors, String driver, int speed, String engine) {
		//super();
		this.doors = doors;
		this.driver = driver;
		this.speed = speed;
		this.engine = engine;
	}
	
	
	public Car() {
		this.doors = "Open";
		this.driver = "Absent";
		this.speed = 0;
		this.engine = "on";
	}


	public void setSpeed(int speed) {
		this.speed=speed;
		
	}
	
	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getspeed() {
		
		return speed;
	}
	
	public String run() {
		
		if(doors.equalsIgnoreCase("Closed") && speed>10 && driver.equalsIgnoreCase("Seated")
				&& engine.equalsIgnoreCase("on")) {
			return "Car is on running Mode";
		}
		else {
			return "Car is not on running Mode";
		}
	}

	
	
	
}
