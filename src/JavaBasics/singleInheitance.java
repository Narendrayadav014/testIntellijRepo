package JavaBasics;


class Animal{
	public void eat(){
		System.out.println("Animal Eats..");
	}
}
class Dog extends Animal{
	public void bark(){
		System.out.println("Dog Barks....");
	}
//	public void eat(){
//		System.out.println("Dog Eats..");       Overridden Method from Class Animal
//	}
}

public class singleInheitance {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
		dog.eat();
	}

}
