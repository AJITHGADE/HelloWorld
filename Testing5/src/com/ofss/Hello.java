package com.ofss;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cr=new Car("closed","seated",10,"ON");
		
		cr.setSpeed(12);
		
		System.out.println(cr.getspeed());
		
		cr.setDoors("Open");

		System.out.println(cr.getDoors());
		
		System.out.println(cr.run());
	}

}
