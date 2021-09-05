package edu.imjeong.playbaseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * 베이스볼 게임 숫자 검증 테스트 코드
 * @author inmook,jeong
 * @since 2021.09.05
 */
public class BaseballNumberTest {
	
	/*
	 * TODO
	 * 1. 야구게임이 시작될 때 컴퓨터의 숫자가 3자리인지 체크
	 * 2. 컴퓨터의 3자리 숫자 중 중복되는 숫자가 없는지 체크
	 * 3. 사용자가 입력한 값이 숫자인지 체크
	 * 4. 사용자가 입력한 값이 3자리 숫자인지 체크
	 * 5. 사용자가 입력한 3자리 숫자 중 중복되는 숫자가 없는지 체크
	 */
	
	// 1. 야구게임이 시작될 때 컴퓨터의 숫자가 3자리인지 체크
	@Test
	void isComputerNumber3Digit() {
		int min=1, max=9;
		String computerNumber = "";
		
		while(computerNumber.length() < 3) {
			int number = (int) ((Math.random() * (max-min)) + min);
			computerNumber += number;
		}
		
		assertThat(computerNumber.length()).isEqualTo(3);
	}
	
	// 2. 컴퓨터의 3자리 숫자 중 중복되는 숫자가 없는지 체크
	@Test
	void is3DigitNumberNotDuplicate() {
		int min=1, max=9;
		String computerNumber = "";
		
		while(computerNumber.length() < 3) {
			int number = (int) ((Math.random() * (max-min)) + min);
			if(!computerNumber.contains(String.valueOf(number))) computerNumber += number;
		}
		
		assertThat(computerNumber.charAt(0)).isNotEqualTo(computerNumber.charAt(1));
		assertThat(computerNumber.charAt(0)).isNotEqualTo(computerNumber.charAt(2));
		assertThat(computerNumber.charAt(1)).isNotEqualTo(computerNumber.charAt(2));
	}
	
	// 3. 사용자가 입력한 값이 숫자인지 체크
	@Test
	void isUserInputANumber() {
		Scanner scan = new Scanner(System.in);
		String userNumber = scan.nextLine();
		String regex = "^[1-9]*$";
		scan.close();
		
		assertThat(Pattern.matches(regex, userNumber)).isTrue();
	}
	
	// 4. 사용자가 입력한 값이 3자리 숫자인지 체크
	@Test
	void inUserNumber3Digit() {
		Scanner scan = new Scanner(System.in);
		String userNumber = scan.nextLine();
		String regex = "^[1-9]*$";
		scan.close();
		
		assertThat(Pattern.matches(regex, userNumber)).isTrue();
		assertThat(userNumber.length()).isEqualTo(3);
	}
	
	// 5. 사용자가 입력한 3자리 숫자 중 중복되는 숫자가 없는지 체크
	@Test
	void isUserNumberNotDuplicate() {
		Scanner scan = new Scanner(System.in);
		String userNumber = scan.nextLine();
		String regex = "^[1-9]*$";
		scan.close();
		
		assertThat(Pattern.matches(regex, userNumber)).isTrue();
		assertThat(userNumber.length()).isEqualTo(3);
		
		assertThat(userNumber.charAt(0)).isNotEqualTo(userNumber.charAt(1));
		assertThat(userNumber.charAt(0)).isNotEqualTo(userNumber.charAt(2));
		assertThat(userNumber.charAt(1)).isNotEqualTo(userNumber.charAt(2));
	}
}
