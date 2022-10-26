package constructor;

public class Constructor2 {
	
	  public Constructor2() {
	    this("New York");
	    System.out.println("It's one of the MNC's ");
	  }	
	

	  public Constructor2(int id) {
	    this("Deepthi",937837.6368f);
	    System.out.println("Employee id is "+id);
	  }
	  
	  public Constructor2(String name) {
	    this(56435);
	    System.out.println("Head quarters is in "+name);
	  }

	  public Constructor2(String name,float sal) {
	    System.out.println("Employee name is "+name);
	    System.out.println("Her salary is "+sal);
	  }

	  public static void main(String[] args) {
		  Constructor2 a = new Constructor2();
	  }

	}


