package JavaBasics;

/*Java does not supports the copy constructor for copying the values of the objects.
But we can do this by two ways-
		1. using constructor
		2. By assigning the value of one object to another object
		3. using clone() method
 */

class Student{
	int rollNo;
	String name;
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	public void display(){
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Name : "+name);
	}
	Student(){

	}

//	//Method 1------
//	public Student(Student object){
//		/* This Constructor takes the object as the argument and then used to assign the values to the
//		attributes..
//		 */
//		System.out.println("Displaying the Copied Values...");
//		this.name=object.name;
//		this.rollNo=object.rollNo;
//	}
}
public class CopyConsValues {
	public static void main(String[] args) {
		Student obj=new Student(25,"SpiderMan");
		obj.display();
//		Student obj2=new Student(obj);
//		obj2.display();
		//Method 2------
		//Copying the values of the previous object in the new object
		Student obj2=new Student();
		obj2.rollNo=obj.rollNo;
		obj2.name=obj.name;
		obj2.display();
	}
}


