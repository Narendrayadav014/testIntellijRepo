package JavaBasics;

public class Array_Demo {
	public static void main(String[] args) {
		int []myArray=new int[5];
		myArray[0]=10;
		myArray[1]=20;
		myArray[2]=30;
		myArray[3]=40;
		myArray[4]=50;

		//Printing the Array Elements
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Element At Index " + i +" "+ myArray[i]);

		}
		System.out.println("Printing using for-each loop----");
		for (int i:myArray) {
			System.out.println(i);

		}

	}
}
