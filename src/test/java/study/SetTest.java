package study;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;

/**
 * Set Collection Test Class
 * @author inmook, Jeong
 * @since 2021. 07. 06
 */
public class SetTest {
	private Set<Integer> numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}
}
