package corejava;

public class ConstructorDemo {
	
	//Default Constructor
	public ConstructorDemo() {
		System.out.println("I am in the constructor");
	}
	
	//Parameterized contructor
	public ConstructorDemo(int a, int b) {
		System.out.println("I am in the Parameterized constructor");
	}
	
	public ConstructorDemo(String str) {
		System.out.println(str);
	}
	public void getData() {
		System.out.println("I am in the method");
	}
	public static void main(String[] args) {
		/* Constructor execute block of code whenever an object is created
		 * will not return any values
		 * name of the constructor should be same as class name
		 * Here if we create the object of that ConstructorDemo class then consturctor will called and run 
		 * Compiler will call default constructor if we do not define constructor
		 * Constructor Types 1) Parameterized contructor
		*/
		
		ConstructorDemo c=new ConstructorDemo(); // Here we create object so constructor will call here 
		ConstructorDemo pc=new ConstructorDemo(4,5); // Here parameterzied constructor will call
		ConstructorDemo pcn=new ConstructorDemo("Hello");
	}

}
