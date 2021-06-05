package JavaBasics;
import java.util.*;
public class arraySum {
	public static void main(String[] args) {
		float []floatArray=new float[5];
		float sum=0f;

		Scanner sc=new Scanner(System.in);
		for (int i = 0; i <5 ; i++) {
			System.out.println("Enter the Number : ");
			floatArray[i]=sc.nextFloat();

		}
		for (float num:floatArray) {
			sum+=num;

		}
		System.out.println("Sum of the Element of the Array is : "+ sum);
	}
}
