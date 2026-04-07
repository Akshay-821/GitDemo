package course;

import java.util.ArrayList;

public class WordStartingWithLetter {

	public static void main(String[] args) {
		ArrayList< String> a= new ArrayList<String>();
		a.add("Akshay");
		a.add("Sandip");
		a.add("Chetan");
		a.add("String");
		a.add("Aniket");
		
		int count=0;
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			
			if(name.startsWith("A")) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
