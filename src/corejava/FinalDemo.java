package corejava;

public class FinalDemo {
	
	public void demo() {
		System.out.println("Number 1");
		System.out.println("Number 2");
	}

	// If we make class as a final then we cannot extends this class and if for method this method cannot be overridden
	public static void main(String[] args) {
		
		final int  i=4; //if we create any variable as final then i values should not changed anyhow

	}

}
