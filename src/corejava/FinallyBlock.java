package corejava;
// interview q: in what case finally block will not executed ans is when we forcefully stop the jvm by pressing red button below
public class FinallyBlock {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		try {

//			int c=a/b; //infinte (arithmetic Exception)
//			System.out.println(c);
			int arr[] = new int[5];
			System.out.println(arr[7]);
		}

		catch (ArithmeticException et) { // All these exceptions extends Exception
			System.out.println("I have catch the Arithmetic Exception");
		}

		catch (IndexOutOfBoundsException ets) { // All these exceptions extends Exception
			System.out.println("I have catch the IndexOutOfBoundsException Exception");
		} catch (Exception e) { // This "Exception' is general exception (Parent) and E ir object reference
			System.out.println("I have catch the exception");
		}
		finally {
			//This block is executed irrespective of the exception thrown or not
			// This block is only be used when we use try block
			// Example delete cookies and driver.close we can use this in finally block
			// we can use combination of try and finally by catch 
		}
	}

}
/*final is a keyword to make variables/methods/classes immutable or unchangeable. finally is a block used in exception handling to guarantee code execution. finalize is a deprecated method used for cleaning up resources just before garbage collection*/