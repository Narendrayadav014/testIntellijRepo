package JavaBasics;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class revTriangle {
	static void createTriangle(int n){
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Levels : ");
		int num=scanner.nextInt();
		createTriangle(num);
	}
}
