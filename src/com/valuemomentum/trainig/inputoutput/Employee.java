package com.valuemomentum.trainig.inputoutput;

import java.io.Serializable;

public class Employee implements Serializable {
	public String name;
	public String address;
	public transient int SSn;
	public int number;
/*	public Employee(String name, String address, int sSn, int number) {
		super();
		this.name = name;
		this.address = address;
		SSn = sSn;
		this.number = number;
	}*/
		public void mailCheck() {
			System.out.println("Mailing a check to"+name+" "+address);
		}
	
	
	

}
