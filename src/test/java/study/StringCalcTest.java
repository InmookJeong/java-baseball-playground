package study;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * Strig Calculator Test Class
 * @author inmook, Jeong
 * @since 2021. 07. 29
 */
public class StringCalcTest {
	
	int num = 0;
	String a = "";
	
	/**
	 * 요구사항 <br/>
	 * &emsp;- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
	 * &emsp;- 문자열 계산기는 사칙연산 의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈보다 먼저 계산해야 하지만 이를 무시한다.
	 * &emsp;- 예를들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
	 */
	@Test
	void stringCalculator() {
		// 사용자로부터 문자열 값 입력 받기
		String value = new Scanner(System.in).nextLine();
		// 공백을 기준으로 Split
		String[] values = value.split(" ");
		
		
		for(String v : values) {
			calculateResult(v);
		}
		System.out.println("result : " + num);
	}
	
	void calculateResult(String value) {
		String numericRegExp = "^[0-9]+$";
		if(value.matches(numericRegExp)) {
			int number = Integer.parseInt(value);
			calculater(number);
		} else  {
			a = value;
		}
	}
	
	// 실제 계산.
	void calculater(int number) {
		// 계산을 위한 num 값이 0인 경어 파라미터를 num에 대입
		if(num == 0) {
			num= number;
			return;
		}
		
		// num의 값이 0이 아닌 경우 사칙연산 실행
		switch(a) {
			case "+" :
				num += number;
				break;
			case "-" :
				num -= number;
				break;
			case "*" :
				num *= number;
				break;
			case "/" :
				num /= number;
				break;
		}
	}
}
