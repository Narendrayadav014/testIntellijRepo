/*The constructors are used in java to initialised value at the time of object creation .
There are two types of constructors in java
1. No Perimeterised orn Default constructors
2. Perimeterised Constructors
 */

package JavaBasics;
class myEmployee{
	int id;
	String name;
	public myEmployee(){
		System.out.println("Default Constructor....");
	}
	public void printDetails(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}

}

public class Constructors {
	public static void main(String[] args) {
		myEmployee harry= new myEmployee();
		//Initialising the values--
		harry.id=101;
		harry.name="Munna Bhaiya";
		harry.printDetails();
		/*The Default constructor will return the default values of the arguments
		if we don't initialise the argument's value
		*/
	}

}
