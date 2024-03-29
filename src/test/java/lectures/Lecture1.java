package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Lecture1 {

	@Test
	public void imperativeApproach() throws IOException {
		List<Person> people = MockData.getPeople();
		// 1. Find people aged less or equal 18
		List<Person> persons = people.stream().filter(p -> p.getAge() <= 18).collect(Collectors.toList());
//		persons.forEach(p->System.out.println(p));
		
		// 2. Then change implementation to find first 10 people
		List<Person> persons1 = people.stream().filter(p -> p.getAge() <= 18).limit(10).collect(Collectors.toList());
		persons1.forEach(p->System.out.println(p));
		

	}

	@Test
	public void declarativeApproachUsingStreams() throws Exception {
		ImmutableList<Person> people = MockData.getPeople();

	}
}
