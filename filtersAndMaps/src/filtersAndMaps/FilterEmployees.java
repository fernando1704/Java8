package filtersAndMaps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterEmployees {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", 35, 50000.0), new Employee("Bob", 30, 60000.0),
				new Employee("Charlie", 22, 45000.0), new Employee("Diana", 28, 70000.0),
				new Employee("Karl", 32, 30000.0), new Employee("Ana", 33, 75000.0));

		Predicate<Employee> ageAndSalaryPredicate = e -> e.getAge() < 30 && e.getSalary() > 30000;
		employees.stream().filter(ageAndSalaryPredicate).forEach(System.out::println);
	}
}
