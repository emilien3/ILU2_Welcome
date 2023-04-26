package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {	
	
	@Test
	void testEX_1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	
	@Test 
	void testEX_2() {
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome(null), "Hello, my friend");
		assertEquals(Welcome.welcome("  "), "Hello, my friend");
	}
	
	

}
