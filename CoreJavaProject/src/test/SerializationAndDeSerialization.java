package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	double studentId;
	
	Student(String n, int m,double id)
	{
		this.name = n;
		this.age = m;
		this.studentId = id;
		
	}
}

public class SerializationAndDeSerialization {
	
	public static void main(String[] args) {
		
		Student student = new Student("KAPIL5443",25, 41526);

		//String byteObject = student;
		FileOutputStream fos;
		try {
			
			fos = new FileOutputStream("/Users/kapil/Desktop/test1/SerializationExample.txt");
			 ObjectOutputStream oos;
			 oos = new ObjectOutputStream(fos);
			 oos.writeObject(student);
			 //oos.close();
			 //fos.close();
			 Student student1 = new Student("Parkash", 26, 73246);
			 /*student.age=26;
			 student.name= "Parkash";
			 student.studentId = 73246;*/
			 oos.writeObject(student1);
			 oos.close();
			 fos.close();
			 
			System.out.println("write successful");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(byteObject);
		
	}

}
