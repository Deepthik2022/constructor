package constructor;

public class Constructor {
	
	public Constructor() {
		this(500.50f);
		System.out.println("finished car");
	}
	public Constructor(float weight) {
		this(230);
		System.out.println("weight of the car is "+weight+"kgs");
	}
	public Constructor(int topSpeed) {
		this("car body");
		System.out.println("car topspeed is "+topSpeed);
	}
	public Constructor(String car) {
		System.out.println("create a "+car);
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		
	}

}
