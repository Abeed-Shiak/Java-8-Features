package Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		//count(),min(),max(), methods
		
		Stream<Integer>stream = Stream.of(12,32,65,41,25,65,32);
		System.out.println(stream.count());
		
		Integer min = stream.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("min values" + min);
		
		Integer max = stream.max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("max values"  + max);

}
}