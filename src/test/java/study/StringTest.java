package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    
    /**
     * 요구사항 1-1<br/>
     * &emsp;- "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
     */
    @Test
    void split1() {
    	String[] actual = "1,2".split(",");
    	assertThat(actual).contains("1", "2");
    }
    
    /**
     * 요구사항 1-2<br/>
     * &emsp;- "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
     */
    @Test
    void split2() {
    	String[] actual = "1".split(",");
    	// 배열 순서까지 정확해야 Test Success.
    	assertThat(actual).containsExactly("1");
    }
    
    /**
     * 요구사항 2<br/>
     * &emsp;- "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
     */
    @Test
    void substring() {
    	String actualStr = "(1,2)";
    	String actual = actualStr.substring(actualStr.indexOf("(")+1, actualStr.indexOf(")"));
    	assertThat(actual).isEqualTo("1,2");
    }
    
    /**
     * 요구사항 3<br/>
     * &emsp;- "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.<br/>
     * &emsp;- String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.<br/>
     * &emsp;- JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다. 
     */
    @Test
    @DisplayName(value = "문자열의 charAt() 메소드를 활용해 특정 위치의 문자열을 가져오기")
    void charAt() {
    	String actualStr = "abc";
    	
    	// TODO
    	assertThatThrownBy(() -> {
    		actualStr.charAt(5);
    	}).isInstanceOf(IndexOutOfBoundsException.class)
    		.hasMessageContaining("Index : "+actualStr.length()+", Size : "+actualStr.length());
    	
    	// TODO
//    	assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
//    		actualStr.charAt(4);
//    	}).withMessageMatching("Index : \\d+, Size : \\d+");
    }
}
