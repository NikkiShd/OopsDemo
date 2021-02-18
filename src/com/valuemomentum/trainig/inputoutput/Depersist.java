package com.valuemomentum.trainig.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws Exception{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/demo/f.txt"));
Student s=(Student)in.readObject();
System.out.println(s.id+" "+ s.name);
in.close();
	}

}
