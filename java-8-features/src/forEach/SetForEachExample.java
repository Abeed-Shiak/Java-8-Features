package forEach;

import java.util.HashSet;
import java.util.Set;

public class SetForEachExample {
	public static void main(String[] args) {
		Set<Person>set = new HashSet<>();
		set.add(new Person("Abdul", 1));
		set.add(new Person("sajeeda",2 ));
		set.add(new Person("King", 3));
		set.add(new Person("queen",4 ));
		
		//for Each
		
		for (Person person : set) {
			System.out.println(person.getName());
			System.out.println(person.getId());
			
		}
		//for Each +lambda
		
		set.forEach((pesron)-> {System.out.println(pesron.getName());
		              System.out.println(pesron.getId());
		});
		//using stream with forEach
		set.stream().forEach((pesron)->{System.out.println(pesron.getName());
		                                  System.out.println(pesron.getId());
		});
	}

}
