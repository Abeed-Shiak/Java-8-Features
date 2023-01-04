package forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {
	public static void main(String[] args) {
		
		Map<Integer, Person>map = new HashMap<>();
		map.put(1, new Person("kya", 1));
		map.put(2, new Person("ji", 2));
		map.put(3, new Person("bhaji", 3));
		
		//use for Each 
		for(Entry<Integer, Person> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			
		}
		//use forEach method +lambda expression 
		map.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v.getName());
			
		});
		

	}

}
