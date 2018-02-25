package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void 스트링주소테스트() {
		 String param1 = "최희진";
		 String param2 = "최희진";
		 String param3 = new String("최희진");
		 String param4 = "최희진";
		 System.out.println(param1!=param2);
		 
		 assertTrue(param1!=param3);
	}
	
}
