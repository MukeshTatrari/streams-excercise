package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

	@Test
	public void understandingFilter() throws Exception {
		ImmutableList<Car> cars = MockData.getCars();
//		cars.stream().filter(c -> c.getPrice() < 10000).forEach(System.out::println);

	}

	@Test
	public void ourFirstMapping() throws Exception {
		// transform from one data type to another
		List<Person> people = MockData.getPeople();
		List<PersonDTO> dtos = people.stream().map(PersonDTO::map).collect(Collectors.toList());
		dtos.forEach(System.out::println);
	}

	@Test
	public void averageCarPrice() throws Exception {
		// calculate average of car prices
		List<Car> cars = MockData.getCars();
		OptionalDouble cards =  cars.stream().mapToDouble(c->c.getPrice()).average();
		System.out.println(cards.getAsDouble());

	}

	@Test
	public void test() throws Exception {

	}
}
