package JavaBasics;

//Super keyword only deals with the attributes and methods of the immediate parents.

class Base{
	Base(){
		System.out.println("Base Class Constructors Called...");
	}
	Base(int x){
		System.out.println("Base Class Constructors with value of x : "+x);
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("Derived Class Constructor Called...");
	}
	Derived(int x,int y){
	super(x);
		System.out.println("Derived Class Constructor with value of y : "+y);
	}
}
class Derived2 extends Derived{
	Derived2(){
		System.out.println("Derived class 2 constructor called...");
	}
	Derived2(int x,int y,int z){
		super(x,y);
		System.out.println("Derived 2 Constructor with value of z : "+z);
	}
}
public class ConstructorInheritance {
	public static void main(String[] args) {
		//Derived d=new Derived();
		/*This wil call the the Base class constructor first and then
		 calls the derived class constructor.
		 If no parameters are passed then the no parameter constructor is always called.
		*/

		//Derived d=new Derived(10,20);
		/*This will call the parameterised constructors from both classes.
		super keyword is used to call the parameterised constructor from the Base class.
		*/

		Derived2 d=new Derived2(10,20,30);
		//This will call all the parameterised constructors of all the classes.

	}
}
