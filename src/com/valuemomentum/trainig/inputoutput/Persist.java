package com.valuemomentum.trainig.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
	Student s1=new Student(101,"Nikita");
	
	FileOutputStream fout=new FileOutputStream("c:/demo/f.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
 
	out.writeObject(s1);
	out.flush();
	System.out.println("Success");
	}

}
