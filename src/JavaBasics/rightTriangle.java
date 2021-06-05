package JavaBasics;
import java.util.Scanner;

public class rightTriangle {

	static void createTriangle(int n){
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Depth : ");
		int n=sc.nextInt();
		createTriangle(n);
	}
}
