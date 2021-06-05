package JavaBasics;
import java.util.Scanner;

public class reverseArray {


//	static int[] inputArray(int size){
//		int []array =new int[size];
//		int []revArray ;
//		revArray=new int[size];
//
//		Scanner sc=new Scanner(System.in);
//
//		for (int i = 0; i <size ; i++) {
//			System.out.println("Enter "+ i+ " Element of Array :");
//			array[i]=sc.nextInt();
//		}
//		revArray=reverseArray(array,size);
//		return revArray;
//	}
//
//	static int[] reverseArray(int[]array,int size){
//		int []newArray=new int [size];
//		for (int i = 1; i <=size; i++) {
//			newArray[size - i] = array[i];
//		}
//		return newArray;
//	}



	public static void main(String[] args) {
//		int size;
//		int []revArray;
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of Array :");
//		size=sc.nextInt();
//		revArray=new int[size];
//		revArray=inputArray(size);
//
//		System.out.println("The Reversed Array is : ");
//		for (int i = 0; i <size ; i++) {
//			System.out.println(revArray[i]);
		int []array={1,2,3,4,5};
		int []newArray=new int[5];
		for (int i = 1; i <=5; i++) {
			newArray[5 - i] = array[i];
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(newArray[i]);
		}

		}
	}

