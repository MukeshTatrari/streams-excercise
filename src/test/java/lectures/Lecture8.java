package lectures;

import beans.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Lecture8 {

	@Test
	public void simpleGrouping() throws Exception {

		Map<String, List<Car>> grouping = MockData.getCars().stream().collect(Collectors.groupingBy(Car::getMake));
		grouping.forEach((name, cars) -> {
			System.out.println(name);
			cars.forEach(System.out::println);
		});

	}

	@Test
	public void groupingAndCounting() throws Exception {
		ArrayList<String> names = Lists.newArrayList("John", "John", "Mariam", "Alex", "Mohammado", "Mohammado",
				"Vincent", "Alex", "Alex");
		Map<String, Long> counting = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		counting.forEach((name,value)->{
			System.out.println(name + " :::: " + value);
		});

	}

}