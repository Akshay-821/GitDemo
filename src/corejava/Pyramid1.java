package corejava;

import java.util.Iterator;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		
		for(int i=0; i<4; i++) {
			
			for(int j=1; j<=4-i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
		}
		System.out.println("Pyramid succesfull");
		System.out.println("Pyramid succesfully done");
	}

}

//output
//	1	2	3	4	
//	5	6	7	
//	8	9	
//	10	
