package JavaBasics;

class Emp{
	int salary;
	String name;
	public Emp(){
		System.out.println("No Param Constructor is Called..");
	}
	public Emp(int salary,String name){
		System.out.println("Parameterised Constructor is Called..");
		this.name=name;
		this.salary=salary;
	}
	public void display(){
		System.out.println("Name of the Employee : "+name);
		System.out.println("Salary of the Employee : "+salary);
	}
}
public class ParamConstructor {
	public static void main(String[] args) {
		Emp emp=new Emp();  //Calls the No param Constructor
		emp.display();      //Display the default values

		Emp harry=new Emp(2000,"Iron Man"); //Calls the Parameterised Constructor
		harry.display();    //Prints the initialised values

	}
}
