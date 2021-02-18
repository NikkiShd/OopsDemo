package com.valuemomentum.trainig.inputoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
DataInputStream d=new DataInputStream(new FileInputStream("c:/demo/data.txt"));
DataOutputStream out=new DataOutputStream(new FileOutputStream("c:/demo/data.txt"));
String count;
while((count=d.readLine())!=null) {
	   String count1;
       while((count1=d.readLine())!=null)
       {
           String u=count1.toUpperCase();
           System.out.println(u);
           out.writeBytes(u+ " ");
           d.close();
           
           out.close();
       }
       
   }
	}
}





