package corejava;
//The static keyword in Java is a non-access modifier used to declare members that belong to the class itself, rather than to any specific instance (object) of the class. Static members are shared by all objects of the class and can be accessed without creating an object
public class StacticVar {
	
	String name; //Instance Variable
	String address; 
	static String city; //when we define any variable is static then it will be part of class not object 
	static int i;
//	static String city="Banglore"; //class variable
//	static int i=0; //if we remove static here it will print only 1 in the output
	
	static {
		city="Banglore";
		i=0;
	}
	StacticVar(String name, String address){ //constructor
		this.name=name; //local variables
		this.address=address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address+" "+city);
	}
	
	public static void city() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		
		StacticVar s=new StacticVar("Akshay", "Mandangad");
		StacticVar sn=new StacticVar("Sandip", "Kumbale");
		s.getAddress();
		sn.getAddress();
		StacticVar.city(); //for static we use classname.static method name.
		StacticVar.i=4;
		s.address="XYZ";
	}
}
