package com.valuemomentum.trainig.inputoutput;
import java.io.*;


public class BufferedWriterDemo{ 
public BufferedWriterDemo(FileWriter writer) {
		// TODO Auto-generated constructor stub
	}

public static void main(String args[]) { 

// Writing to a file using BufferedWriter in Java 

try { 
FileWriter writer = new FileWriter("c:/demo/data.txt",true); 
BufferedWriter bwr = new BufferedWriter(writer);  

bwr.write("James"); 
bwr.write("\n"); // bwr.newLine();
bwr.write("Hobert"); 
bwr.close(); 

System.out.println("succesfully written to a file"); } 
catch (IOException ioe) { 
ioe.printStackTrace(); 

}
 } 
}

