package com.ofss;

import com.ofss.vehickes.Bike;
import com.ofss.vehickes.Carx;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike=new Bike("Short","Diesel",3);
		System.out.println(bike);
		System.out.println(bike.getHandle());
		System.out.println(bike.getWheels());
		System.out.println(bike.getEngine());
		
		//Carx car=new Carx();
		
		//car.ac="Daikin";
		//car.wheels=4;
		
		//System.out.println(bike.wheels);

	}

}
