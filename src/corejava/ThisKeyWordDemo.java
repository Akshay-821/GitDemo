package corejava;

public class ThisKeyWordDemo {
	
	int a=3;
	
	public void getData() {
		
		int a=5;
		System.out.println(a);
		//The this keyword in Java is a reference variable that refers to the current object.
		System.out.println(this.a); //this reffers to current object and this object scope lies in class level (global variable)
		int b=a+this.a;
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisKeyWordDemo t=new ThisKeyWordDemo();
		t.getData();

	}

}
