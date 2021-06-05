package JavaBasics;
import java.util.Scanner;

public class arrayMin {
	static int minElement(int[]array){
		int min;
		min=array[0];
		for (int i = 0; i <array.length ; i++) {
			if(array[i]<min){
				min=array[i];
			}
		}
		return min;
	}
	static int[] inputElements(){
		int []array;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array :");
		int size=sc.nextInt();
		array= new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter "+i+" Element of Array ");
			array[i]=sc.nextInt();
		}
		return array;
	}

	public static void main(String[] args) {
		int minElement;
		minElement=minElement(inputElements());
		System.out.println("Minimum element in Array is : "+minElement);
	}
}

