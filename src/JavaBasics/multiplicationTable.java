package JavaBasics;

import java.util.Scanner;

public class multiplicationTable {

	static void createTable(int n){
		int i=1;
		System.out.println("Multiplication Table of " +n +" -");
		while(i<=10){
			System.out.println(n+" * "+i+" = "+ (n*i));
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Print Table : ");
		int num=sc.nextInt();
		createTable(num);
	}
}
