package JavaBasics;

import java.util.Scanner;

public class arrayMax {
	static int maxElement(int[]array){
		int max;
		max=array[0];
		for (int i = 0; i <array.length ; i++) {
			if(array[i]>max){
				max=array[i];
			}
		}
		return max;
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
		int maxElement;
		maxElement=maxElement(inputElements());
		System.out.println("Maximum element in Array is : "+maxElement);
	}
}
