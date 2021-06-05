package JavaBasics;

public class variableArguments {

	/*
	Java supports the passing of the variable number of arguments in the calling of the method .
	This implies that the same method can be called using different number of arguments.
	The three periods in the method declaration implicitly defines the array of type integer.

	 */
	static void add(int ...arr){
		int sum=0;
		for (int a:arr
		     ) {
			sum+=a;
		}
		System.out.println("The Number of arguments Supplied : "+arr.length);
		System.out.println("The Sum of the numbers is : "+sum);
	}

	public static void main(String[] args) {
		add(2);
		add(2,3);
		add(2,3,4);
		add(2,3,4,5);
	}
}
