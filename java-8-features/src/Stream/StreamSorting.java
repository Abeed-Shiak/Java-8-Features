package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
	public static void main(String[] args) {
		List<String>fruits  =new ArrayList<>();
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("grapes");
		
		List<String>sortedlist =fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedlist);
		
		List<String>sortedlist2 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedlist2);
		
		List<String>sortedlist3 =fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist3);
		
		//Descending order
		
		List<String>sortedlist4 =fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedlist4);
		
		List<String>sortedlist5 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedlist5);
		
		//sort Employee by salary in Ascending order
		List<Employee>employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 23, 50000));
		employees.add(new Employee(11, "mukesh", 20, 25000));
		employees.add(new Employee(12, "kuresh", 19, 35000));
		employees.add(new Employee(13, "kimesh", 32, 54000));
		employees.add(new Employee(14, "nani", 24, 20000));
		
		List<Employee> empsortedlist =  employees.stream()
		.sorted((o1,o2)->(int) (o2.getSalary()- o1.getSalary())).collect(Collectors.toList());
		     System.out.println(empsortedlist);
		List<Employee> empsortedlist1=employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
		 System.out.println(empsortedlist1); //ascending order
		   
		List<Employee> empsortedlist2= employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		  System.out.println(empsortedlist2);//descending order
		
		List<Employee> empsortedlist3= employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		 System.out.println(empsortedlist3);//ascending order By Name
		 
		List<Employee> empsortedlist4 =employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		 System.out.println(empsortedlist4);//descending order
		 
		 
		 
	}
}

