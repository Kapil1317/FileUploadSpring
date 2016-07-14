package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 implements Comparator<Employee> {
	 
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
 
    public Employee1(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
  @Override
  //this is required to print the user friendly information about the Employee
  public String toString() {
      return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
              this.salary + "]";
  }

  public static Comparator<Employee1> NameComparator = new Comparator<Employee1>() {
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.getName().compareTo(e2.getName());
	}
  };

@Override
public int compare(Employee o1, Employee o2) {
	// TODO Auto-generated method stub
	return 0;
}
}


public class ComparatorEg {

	public static void main(String[] args) {

		
		Employee1 emp1 = new Employee1(10, "Parkash", 23, 24042);
		Employee1 emp2 = new Employee1(5, "Shivam", 25, 24042);
		Employee1 emp3 = new Employee1(2, "Ajay", 25, 24042);
		Employee1 emp4 = new Employee1(17, "Rohit", 24, 22000);
		
		List<Employee1> empList = new ArrayList<Employee1>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println(empList.toString());
		Collections.sort(empList, Employee1.NameComparator);
		System.out.println(empList.toString());
		
		
	}

}
