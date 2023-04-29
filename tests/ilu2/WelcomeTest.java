package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {	
		
	@Test
	void testEX_1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
		assertEquals(Welcome.welcome("Jean"), "Hello, Jean");
		assertNotEquals(Welcome.welcome("bob"), "bob");
	}
	
	@Test 
	void testEX_2() {
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome(null), "Hello, my friend");
		assertEquals(Welcome.welcome("  "), "Hello, my friend");
		assertNotEquals(Welcome.welcome("  "), "Hello,   ");
	}
	
	@Test
	void testEX_3() {
		assertEquals(Welcome.welcome("JERRY"), "HELLO, JERRY !");
		assertNotEquals(Welcome.welcome("JEAN"), "Hello, JEAN !");
	}
	
	@Test
	void testEX_4() {
		assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy and Bob");
		assertNotEquals(Welcome.welcome("amy,bob"), "Hello, Amy");
	}
	
	@Test
	void testEX_5() {
		assertEquals(Welcome.welcome("amy,Bob,jean,Amine"), "Hello, Amy, Bob, Jean and Amine");
		assertNotEquals(Welcome.welcome("amy,Bob,jean,Amine"), "Hello, Amy, Bob");
	}
	
	@Test
	void testEX_6() {
		assertEquals(Welcome.welcome("Amy,BOB,Jerry"), "Hello, Amy and Jerry. AND HELLO, BOB !");
		assertNotEquals(Welcome.welcome("Amy,BOB,Jerry"), "Hello, Amy, Jerry, BOB");
		assertNotEquals(Welcome.welcome("Amy,BOB,Jerry"), "Hello, AMY, JERRY, BOB !");
	}
	
	@Test
	void testEX_7() {
		assertEquals(Welcome.welcome("bob,amy,jerry"), "Hello, Bob, Amy and Jerry");
		assertEquals(Welcome.welcome("bob,AMY,jerry,JACK"), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
	}
	
	@Test
	void testEX_8() {
		assertEquals(Welcome.welcome(" bob,   amy,    jerry   "), "Hello, Bob, Amy and Jerry");
		assertEquals(Welcome.welcome("bob,      AMY,  jerry,   JACK "), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
		assertNotEquals(Welcome.welcome("bob , AMY , jerry, JACK "), "Hello, Bob  and  Jerry. AND HELLO,  AMY  AND  JACK  !");
	}
	
	@Test
	void testEX_9() {
		assertEquals(Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob"), "Hello, Bob (*3) and Amy. AND HELLO, JERRY (*2) !");
		assertEquals(Welcome.welcome("bob,bob, bob,  bob, bob, bob"), "Hello, Bob (*6)");
		assertNotEquals(Welcome.welcome("bob , jerry , jerry, AMY, JACK "), "Hello, Bob, Jerry and Jerry. AND HELLO, AMY AND JACK !");
	}
	
	@Test
	void testEX_10(){
		assertEquals(Welcome.welcome("bob, yoda, amy, JERRY"), "Bob, Yoda and Amy Hello. AND HELLO, JERRY !");
		assertEquals(Welcome.welcome("bob, YODA, amy, JERRY, YODA"), "Hello, Bob and Amy. AND YODA (*2) AND JERRY HELLO !");
		assertNotEquals(Welcome.welcome("bob , yoda , jerry, YODA, JACK "), "Hello, Bob, Yoda and Jerry. AND HELLO, YODA AND JACK !");
	}

}
