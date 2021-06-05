package JavaBasics;


import java.util.Scanner;

class Employee{
	int age;
	String name;
	int salary;
	public int getSalary(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Salary of Employee ");
		salary=scanner.nextInt();
		return salary;
	}

}


public class customClass {
	public static void main(String[] args) {
		Employee employee1=new Employee();      //Creating object or instance of the class Employee
		Employee employee2=new Employee();      //Creating object or instance of the class Employee

		//Setting attributes for employee1
		employee1.age=25;
		employee1.name="Iron Man";
		//employee1.salary=15;

		//Setting attributed for the employee2
		employee2.age=27;
		employee2.name="Captian Steve";
		//employee2.salary=20;

		//Printing the values of the Attributes of the objects
		System.out.println("The Name of Employee 1 is : "+employee1.name);
		System.out.println("The Age of Employee 1 is : "+employee1.age);
		System.out.println("The Salary of Employee 1 is : "+employee1.getSalary());

		System.out.println("The Name of Employee 2 is : "+employee2.name);
		System.out.println("The Age of Employee 2 is : "+employee2.age);
		System.out.println("The Salary of Employee 2 is : "+employee2.getSalary());


	}
}
