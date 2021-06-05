package JavaBasics;

import java.util.Scanner;

public class fibonacciRec {
	static int recFibonacci(int term){
		if(term==1)
			return 0;
		if(term==2)
			return 1;
		else{
			return recFibonacci(term-1)+recFibonacci(term-2);
		}

	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of term : ");
		int term=scanner.nextInt();
		int num=recFibonacci(term);
		System.out.println(num);
	}
}
