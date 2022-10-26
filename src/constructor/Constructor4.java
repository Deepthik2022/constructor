package constructor;

public class Constructor4 {
	public Constructor4(float weight) {
		this(1980);
		System.out.println("weight of the car is "+weight);
	}
	public Constructor4(int num) {
		this();
		System.out.println("car model is "+num);
	}
	public Constructor4() {
		System.out.println("Product details are as below");
	}

}
