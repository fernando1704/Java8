package filtersAndMaps;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		String reversed = Stream.of(str.split(" ")).map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reversed);

	}

}
