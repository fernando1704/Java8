package filtersAndMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartsWithCharacter {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "JUnit", "Kotlin", "Pearl");
		String start = "P";

		List<String> result = listOfStrings.stream().filter(s -> s.startsWith(start)).collect(Collectors.toList());
		System.out.println(result);
	}
}
