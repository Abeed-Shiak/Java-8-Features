package MethodRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable{
	void print(String msg);
}



public class MethodReferenceDemo {
	public static int addition(int a,int b) {
		return a+b;
	}
	
	public void display(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		//method reference to a static method
		//lambda expression
		 Function<Integer, Double>function = (input)-> Math.sqrt(input);
	     System.out.println(function.apply(8));
	     
	     //method reference
	       Function<Integer, Double>functionmethodref = Math::sqrt;
	       functionmethodref.apply(8);
	     
	     //lambda expression
	      BiFunction<Integer, Integer, Integer>bifunction = (a,b)-> a+b;
	      System.out.println(bifunction.apply(7, 3));
	      
	      //method reference
	      BiFunction<Integer, Integer, Integer>bifunction1 = MethodReferenceDemo::addition;
	      System.out.println( bifunction1.apply(10, 10));
	     
		  //method reference to an non static method of an object
	       MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
	      
	      //lambda expression 
	       Printable printable = (msg)-> methodReferenceDemo.display(msg);
	       printable.print("Hellow World");
	      
	      //method references 
	       Printable printable2 = methodReferenceDemo::display;
	       printable2.print("KEEP Smiling");
           
	       //references to the instance method of an arbitrary object 
	       //sometimes we call a method of argument in the lambda expression
	       // in that case we can use a method reference to call an instance
	       //method of an arbitrary object of a specific task
	       
	       Function<String, String>function2 = (intput)->intput.toUpperCase();
	       System.out.println(function2.apply("javaguides"));
	       
	       //method reference 
	       Function<String, String>function3 =String::toUpperCase;
	       System.out.println(function3.apply("Enjoy Chedam"));
	       
	       String[]strArray = {"A","E","I","O","U","a","e","i","o","u"};
	       
	       //using lambda expression
	       Arrays.sort(strArray,(s1,s2)->s1.compareTo(s2));
	       
	       //using method refernces
	       Arrays.sort(strArray, String::compareToIgnoreCase);
	       
	       // reference to a constructor
	       List<String>fruits = new ArrayList<>();
	       fruits.add("banana");
	       fruits.add("apple");
	       fruits.add("mango");
	       fruits.add("watermelon");
	       
	       //lambda expression
	       Function<List<String>, Set<String>>setfunction =(fruitList)->new HashSet<>(fruitList);
	       System.out.println(setfunction.apply(fruits));
	       
	       //using method reference 
	       Function<List<String>, Set<String>>setfunctionmethodref = HashSet::new;
	       System.out.println(setfunctionmethodref.apply(fruits));
	       
	       
	      
	}

}
