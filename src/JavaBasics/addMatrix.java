package JavaBasics;
import java.util.*;
public class addMatrix {
	static int[][] addMatrixElements(int[][]mat1,int[][]mat2){
		int [][]sum=new int[2][3];
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col <3 ; col++) {
				sum[row][col]=mat1[row][col]+mat2[row][col];
			}
		}
		return sum;
	}

	static int[][] inputElements(){
		int [][] matrix=new int[2][3];
		Scanner sc=new Scanner(System.in);
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col <3 ; col++) {
				System.out.println("Enter Elements of row "+row + " Col "+col);
				matrix[row][col]=sc.nextInt();
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		int [][] matrix1=new int[2][3];
		int [][] matrix2=new int[2][3];
		int [][] result=new int[2][3];



		matrix1=inputElements();
		matrix2=inputElements();

		result=addMatrixElements(matrix1,matrix2);

		System.out.println("The Sum of two matrix -");
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col <3 ; col++) {
				System.out.println(result[row][col]);

			}
			System.out.println("");
		}

	}
}
