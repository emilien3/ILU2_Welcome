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
		assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy, Bob");
		assertNotEquals(Welcome.welcome("amy,bob"), "Hello, Amy");
	}
	
	@Test
	void testEX_5() {
		assertEquals(Welcome.welcome("amy,Bob,jean,Amine"), "Hello, Amy, Bob, Jean, Amine");
		assertNotEquals(Welcome.welcome("amy,Bob,jean,Amine"), "Hello, Amy, Bob");
	}
	
	@Test
	void testEX_6() {
		assertEquals(Welcome.welcome("Amy,BOB,Jerry"), "Hello, Amy, Jerry. AND HELLO, BOB !");
		assertNotEquals(Welcome.welcome("Amy,BOB,Jerry"), "Hello, Amy, Jerry, BOB");
		assertNotEquals(Welcome.welcome("Amy,BOB,Jerry"), "Hello, AMY, JERRY, BOB !");
	}
}
