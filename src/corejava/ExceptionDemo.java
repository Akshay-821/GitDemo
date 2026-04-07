package corejava;
// we can write try catch follwed by multiple catch block in between nothing should be allowed
public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		try {
			
//			int c=a/b; //infinte (arithmetic Exception)
//			System.out.println(c);
			int arr[]=new int[5];
			System.out.println(arr[7]);
		} 
		

		catch (ArithmeticException et) { //All these exceptions extends Exception
			System.out.println("I have catch the Arithmetic Exception");
		}
		
		catch (IndexOutOfBoundsException ets) { //All these exceptions extends Exception
			System.out.println("I have catch the IndexOutOfBoundsException Exception");
		}
		catch (Exception e) { //This "Exception' is general exception (Parent) and E ir object reference
			System.out.println("I have catch the exception");
		}
	}

}
