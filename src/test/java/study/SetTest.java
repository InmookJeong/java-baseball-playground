package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
	
	/**
	 * 요구사항 2<br/>
	 * &emsp;- Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.<br/>
	 * &emsp;- 구현하고 보니 다음과 같이 중복 코드가 계속해서 발생한다.<br/>
	 * &emsp;- JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다.
	 * @param number
	 */
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	void contains(int number) {
		assertTrue(numbers.contains(number));
	}
	
	/**
	 * 요구사항 3<br/>
	 * &emsp;- 요구사항 2는 contains 메소드 결과 값이 true인 경우만 테스트 가능하다. 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.<br/>
	 * &emsp;- 예를 들어 1, 2, 3 값은 contains 메소드 실행결과 true, 4, 5 값을 넣으면 false 가 반환되는 테스트를 하나의 Test Case로 구현한다.
	 * @param actual
	 * @param expected
	 */
	@ParameterizedTest
	@CsvSource(value = {"1:true", "5:false", "3:true", "2:true"}, delimiter = ':')
	void contains2(int actual, boolean expected) {
		assertThat(numbers.contains(actual)).isEqualTo(expected);
	}
}
