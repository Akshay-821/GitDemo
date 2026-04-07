package course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.checkerframework.checker.units.qual.Length;
import org.checkerframework.checker.units.qual.s;

public class WordCountUsingStrams {

	public static void main(String[] args) {
		ArrayList< String> name= new ArrayList<String>();
		name.add("Akshay");
		name.add("Sandip");
		name.add("Chetan");
		name.add("String");
		name.add("Aniket");
		
		// stream() is collection of strings
		//name.stream() means all the data is goes into stream for further parallel processing
		// lambda expression introduces new -> arrow operator it divided the arrow into two parts  
		//left side represent parameters required by th expression  which can be empty
		//right side represents lambda body which specifies the actions of the lambda expression
		
		//in below s will be scanning the whole list every time
		//there is no life of intermediate operator if there is no terminal operator (intermediate operator= filter() )
		//life of this stream is exists only till terminal operator i.e. count();
		
		long c = name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		
	long d=Stream.of("Akshaya","Sandip","Chetan","String","Aniket").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		//print all the names of arraylist having length greater than 4
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//limit the numbr of result
		name.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		
		//to print the words having last letter as "a" and convert into Uppercase
		Stream.of("Akshaya","Sandip","Chetana","String","Aniket").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print that having first letter as a and sorted with uppercase 
		List<String> namelist=Arrays.asList("Azshaya","Sandip","Chetana","String","Aniket");
		namelist.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
