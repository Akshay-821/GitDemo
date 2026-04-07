package course;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsExamples {

	@Test
	public void wordCount() {
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
		System.out.println("Count of words starts with A");
		
		long c = name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
	}
	
	
	@Test
	public void wordCountsecond(){
		
		long d=Stream.of("Akshay","Sandip","Chetan","String","Aniket").filter(s->
			{
				s.startsWith("A");
				return true; // this should be added else it will give you error
			}).count();	
	}
	
	@Test
	public void CountGreaterThan() {
		System.out.println("print all the names of arraylist having length greater than 4");
		//print all the names of arraylist having length greater than 4
		ArrayList< String> name= new ArrayList<String>();
		name.add("Akshay");
		name.add("Sandip");
		name.add("Chetan");
		name.add("String");
		name.add("Aniket");
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
	
	@Test 
	public void limitNoOfResult() {
		System.out.println("limit the number of result");
		//limit the number of result
		Stream.of("Akshaya","Sandip","Chetan","String","Aniket").filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void Uppercase() {
		System.out.println("to print the words having last letter as a and convert into Uppercase");
		//to print the words having last letter as "a" and convert into Uppercase
		Stream.of("Akshaya","Sandip","Chetan","String","Aniket").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	

	@Test
	public void sorting() {
		System.out.println("print that having first letter as a and sorted with uppercase");
		List<String> namelist=Arrays.asList("Azshaya","Sandip","Chetana","String","Aniket");
		namelist.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	@Test
	public void mergeStream() {
		System.out.println("merge two streams and concat");
		ArrayList< String> name= new ArrayList<String>();
		name.add("Akshay");
		name.add("Sandip");
		name.add("Chetan");
		name.add("String");
		name.add("Aniket");
		
		List<String> namelist=Arrays.asList("Azshaya","Sharma","Sham");
		Stream<String> newStream = Stream.concat(name.stream(), namelist.stream());
		newStream.sorted().forEach(s->System.out.println(s));

	}
	@Test
	public void findMatch() {
		System.out.println("Find match in the list");
		ArrayList< String> newname= new ArrayList<String>();
		newname.add("Adam");
		newname.add("Arnav");
		newname.add("Adam");
		newname.add("String");
		newname.add("Aniket");
		boolean flag = newname.stream().anyMatch(s->s.equalsIgnoreCase("adam"));
		System.out.println(flag);
		AssertJUnit.assertTrue(flag);
		
	}
	
	@Test
	public void streamCollect() {
		System.out.println("Stream Collect method use");
		//streamCollect method is used to collect the result from the stream and convert it into another list
		List<String> namelist=Arrays.asList("Azshaya","Sandip","Chetana","String","Aniket");
		List<String> ls = namelist.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
	}
	
	@Test
	public void streamCollectExamples() {
		List<Integer> list = Arrays.asList(1,3,2,4,5,6,7,3,2,3,5,7,8);
		//print unique number
		//sort the array
		//find third index 
		System.out.println("print unique number");
		List<Integer> ls = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls.get(3));
		
	}
}
