package JavaBasics;
import java.util.Scanner;

public class sortedArray {

	static int[] createArray(){
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


	static boolean checkSorted(int []array){
		int i=0,j=1;
		boolean check;
		check=false;
		while(j<array.length){
			check=false;
			if(array[i]<array[j]){
				check=true;
			}
			else{
				break;
			}
			i=j;
			j=j+1;
		}
		return check;
	}

	public static void main(String[] args) {
		if(checkSorted(createArray())){
			System.out.println("Array is Sorted");
		}
		else {
			System.out.println("Array is not Sorted");
		}
	}
}

