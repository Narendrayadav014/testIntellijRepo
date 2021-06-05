package JavaBasics;

public class averageArray {
	static float calculateAverage(int [] arr){
		//System.out.println("Calculate Average method is Called");
		float avg;
		int sum=0;
		for (int mark:arr) {
			sum+=mark;
		}
		avg=sum/5.0f;
		return avg;
	}

	public static void main(String[] args) {
		int []marks={40,42,41,47,35};
		float avg;
		//averageArray obj=new averageArray();
		avg=calculateAverage(marks);
		System.out.println("Average Marks : "+ avg);
	}
}

