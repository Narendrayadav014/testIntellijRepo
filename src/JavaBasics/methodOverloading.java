package JavaBasics;

public class methodOverloading {
	static void add(int num1,int num2){
		int sum=num1+num2;
		System.out.println("-----------First Add is Called--------------");
		System.out.println("Sum = "+ sum);
	}
	static void add(int num1,int num2,int num3){
		int sum=num1+num2+num3;
		System.out.println("-----------Second Add is Called--------------");
		System.out.println("Sum = "+ sum);
	}
	static void add(int num1,int num2,int num3,int num4){
		int sum=num1+num2+num3+num4;
		System.out.println("-----------Third Add is Called--------------");
		System.out.println("Sum = "+ sum);
	}

	public static void main(String[] args) {
		add(2,3);
		add(2,3,4);
		add(2,3,4,5);
	}
}
