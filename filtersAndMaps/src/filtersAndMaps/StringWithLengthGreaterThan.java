package filtersAndMaps;

import java.util.Arrays;
import java.util.List;

public class StringWithLengthGreaterThan {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "JUnit", "Kotlin", "Pearl");

		int lengthToCompare = 5;

		System.out.println("Strings with length greater than " + lengthToCompare);
		listOfStrings.stream().filter(s -> s.length() > lengthToCompare).forEach(System.out::println);
	}
}
