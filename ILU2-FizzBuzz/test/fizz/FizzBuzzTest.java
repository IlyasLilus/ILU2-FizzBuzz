package fizz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void fizz_un() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}
	
	@Test
	void fizz_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2),"2");
	}

}
