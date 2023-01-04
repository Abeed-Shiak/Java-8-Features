package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementExample {
	public static void main(String[] args) {
		
		//findfirst () findany()
		
		List<Integer>list = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer> element =list.stream().findFirst();
		
		if(element.isPresent()) {
			System.out.println(element.get());
		}else {
			System.out.println("element is present");
		}
		
		Optional<Integer>element2 = list.stream().findAny();
		
		if(element2.isPresent()) {
			System.out.println(element2.get());
		}else {
			System.out.println("elelment is empty");
		}
			
	}
	
}

