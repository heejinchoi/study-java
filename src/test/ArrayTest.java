package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void 스트링배열복사() {
		String[] stringArray = new String[]{"일", "이", "삼"};
		String[] stringArray2 = Arrays.copyOf(stringArray, stringArray.length);
		
		assertEquals("복사가 잘 되었다.", "일", stringArray2[0]);
		
		for(String value : stringArray2) {
			System.out.println(value);
		}
		
	
	}

}
