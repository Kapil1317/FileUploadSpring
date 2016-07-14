package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	 
    private int id;
    private String name;
    private int age;
    private long salary;
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public long getSalary() {
        return salary;
    }
 
    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    @Override
    public int compareTo(Employee emp) {

    	//let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
        
      }
    
    @Override
  //this is required to print the user friendly information about the Employee
  public String toString() {
      return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
              this.salary + "]";
  }
}



public class ComparableEg {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(10, "Parkash", 23, 24042);
		Employee emp2 = new Employee(5, "Shivam", 25, 24042);
		Employee emp3 = new Employee(2, "Ajay", 25, 24042);
		Employee emp4 = new Employee(17, "Rohit", 24, 22000);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println(empList.toString());
		Collections.sort(empList);
		System.out.println(empList.toString());
		
		
	}

}

