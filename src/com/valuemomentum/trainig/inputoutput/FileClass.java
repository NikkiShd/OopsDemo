package com.valuemomentum.trainig.inputoutput;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) {
		File f=new File("c:/test/hello.text");

		try {
			if(f.createNewFile()) {
				System.out.println("New File created!");
			}else {
				System.out.println("The file already exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Name of the file :"+f.getName());
		System.out.println("Path of the file"+f.getPath());
		System.out.println("File Last Modified"+ new Date(f.lastModified()));
		System.out.println("Parent Directory:" +f.getParent());
		System.out.println("size of the file"+f.length()+"Bytes");

	}

}
