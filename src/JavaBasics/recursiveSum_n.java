package JavaBasics;

import java.util.Scanner;

public class recursiveSum_n {
	static int recAdd(int n){
		int sum=0;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else {
			sum = sum +n+ recAdd(n - 1);
			return sum;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to calculate the sum : ");
		int num=sc.nextInt();
		System.out.println(recAdd(num));
	}
}
