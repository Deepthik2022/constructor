package constructor;

public class Constructor1 {
	public Constructor1(String name){
		System.out.println("employee name is "+name);
	}
	public Constructor1(int age) {
		this("Jason");
		System.out.println("employee age is "+age);
	}
	public Constructor1() {
		this(25);
		System.out.println("employee works at Infosys");

		

}
	public static void main(String[] args) {
		Constructor1 c=new Constructor1();
	}
}
