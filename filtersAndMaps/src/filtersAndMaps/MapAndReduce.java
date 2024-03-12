package filtersAndMaps;

import java.util.Arrays;
import java.util.List;

public class MapAndReduce {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Integer sum = listOfIntegers.stream().map(x -> (x * x)).reduce(0, Integer::sum);
		
		System.out.println(sum);
	}

}
