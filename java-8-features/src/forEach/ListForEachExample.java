package forEach;

import java.util.ArrayList;
import java.util.List;


public class ListForEachExample {

	public static void main(String[] args) {

		List<Person>list = new ArrayList<>();
		list.add(new Person("abid", 1));
		list.add(new Person("tirumala", 2));
		list.add(new Person("tiru", 3));
		
		//without java 8
		
		for(Person person :list ) {
			System.out.println(person.getName());
			System.out.println(person.getId());
		}
		list.forEach((person)-> { System.out.println(person.getName());
		                         System.out.println(person.getId());
		
	});
		//stream 
		list.stream().forEach((person)->{ System.out.println(person.getName());
		                                   System.out.println(person.getId());
		
		
		                                   
	});

}}
class Person{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}