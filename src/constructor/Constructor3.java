package constructor;

public class Constructor3 extends Constructor4 {
	
	
	public Constructor3(int year) {
		this("Alto","blue",220);
		System.out.println("Launched in the "+year);	
}
	public Constructor3(String name,String color,int speed) {
		super(500.50f);
		System.out.println("Name of the car is "+name);
		System.out.println("speed of the car is "+speed);
		System.out.println("color of the car is "+color);
		
	}
	public static void main(String[] args) {
		Constructor3 c=new Constructor3(1990);
	}
}
