package com.pirate.comparable;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
/*	public int compareTo(Employee emp) {
		if(salary == emp.salary) {
			return 0;
		}
		else if(salary > emp.salary) {
			return 1;
		}
		return -1;
	}	
*/	
	
	public int compareTo(Employee emp) {
		return this.getName().compareTo(emp.getName());
	}	

}
