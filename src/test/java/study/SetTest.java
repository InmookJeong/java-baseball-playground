package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

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
	
	/**
	 * 요구사항 1<br/>
	 * &emsp;- Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
	 */
	@Test
	void size() {
//		assertTrue(numbers.size() == 3);
		assertThat(numbers.size()).isEqualTo(3);
	}
}
