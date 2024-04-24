package kT;

import java.util.Scanner;
public class Person {
	protected String name;
	protected int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for age
	public void setAge(int age) {
		this.age = age;
	}

	// Example of usage
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        
	        Person person = new Person(name, age);
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());

	        scanner.close();
	    }
}
