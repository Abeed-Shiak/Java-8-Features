package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObject {
	public static void main(String[] args) {
		
		//create stream 
		Stream<String>stream = Stream.of("a","e","i","o","u");
		stream.forEach((System.out::println));
		
		//create stream from sources
		  Collection<String>collect =  Arrays.asList("java","sql","J2EE","ORACLE","PYTHON");
		  Stream<String>stream2  =    collect.stream();
		  stream2.forEach(System.out::println);
	      //list stream
		  List<String>list =  Arrays.asList("java","sql","J2EE","ORACLE","PYTHON");
		  Stream<String>stream3  =  list.stream();
		  stream3.forEach(System.out::println);
		  //set stream
		  Set<String>set = new HashSet<>();
		  Stream<String>stream4 =set.stream();
		  stream4.forEach(System.out::println);
	}
	
	

}
