package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {

		 Student si=null ;
		  try  
		  {
		   FileInputStream fis = new FileInputStream("/Users/kapil/Desktop/test1/SerializationExample.txt");
		   ObjectInputStream ois = new ObjectInputStream(fis);
		  // ObjectOutputStream ois = new ObjectOutputStream(fis);
		   si = (Student)ois.readObject();
		   si = (Student)ois.readObject();
		  // throw new Exception();
		  } 
		  catch (Exception e)
		   { 
			  System.out.println("caught Exception");
			  e.printStackTrace(); 
			  
		   }
		  System.out.println("name " + si.name);
		  System.out. println("Age "+si.age);
		  System.out.println("Student Id" + si.studentId);
		 }
		
	}

