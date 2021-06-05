package JavaBasics;
import java.util.*;

public class arrayElementSearch {
	public static void main(String[] args) {
		int []numbers;
		int size;
		boolean present=false;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");

		size=sc.nextInt();
		numbers=new int[size];

		for (int i = 0; i <size ; i++) {
			System.out.println("Enter the Element :");
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to be searched ");
		int toSearch=sc.nextInt();

		for (int num:numbers
		     ) {
			if(toSearch==num){
				present=true;
			}
		}
		if(present==true){
			System.out.println("Element is present in Array");
		}else {
			System.out.println("Element is not present in Array");
		}
	}
}
