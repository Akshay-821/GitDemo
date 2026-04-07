package corejava;

public class SuperChild extends SuperParent {
	
	String name="Automation";
	//for constructor
	public SuperChild() {
		super();// this should be written to the first line when we want parent constructor in child constructor
		System.out.println("I am Child constructor");
	}
	public void getStringData() {
		
		System.out.println(name);
		System.out.println(super.name); // super keyword is used for differenciation if there is same variable is used in parent as well as child
	}
	
	public void getData() {
		super.getData(); //used to get parent method
		System.out.println("I am Child class");
	}

	public static void main(String[] args) {
	
		SuperChild c= new SuperChild();
		c.getStringData();
		c.getData();
	}

}
