package JavaBasics;
class EmployeeN{
	int salary;
	String name;
	public int getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
}
class Square{
	int side;
	public int calcArea(){
		return side*side;
	}
	public int calcPerimeter(){
		return 4*side;
	}
}
public class PracticeClass {
	public static void main(String[] args) {
		/*
		//Problem 1
		EmployeeN harry=new EmployeeN();
		harry.salary=2000;
		harry.setName("Harry");
		System.out.println(harry.getName());
		System.out.println(harry.getSalary());
		*/
		//Problem 2
		Square sq=new Square();
		sq.side=3;
		System.out.println("Area of Square : "+sq.calcArea());
		System.out.println("Perimeter of Square : "+sq.calcPerimeter());

	}
}
