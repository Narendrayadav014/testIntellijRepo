package JavaBasics;

class BabyDog extends Dog{
	public void weep(){
		System.out.println("Baby Dog is Weeping...");
	}
}
public class multiLevelInherit {

	public static void main(String[] args) {
		BabyDog bd=new BabyDog();
		bd.weep();
		bd.eat();
		bd.bark();

	}
}
