package Com.Demo.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Com.Demo.Main.Find_EvenOdd;

public class EvenOddTest {
	public void validdate() {
		assertEquals(true, Find_EvenOdd.validateEvenOdd(8));
	}
	@Test
	public void validDates() {
		assertEquals(true, Find_EvenOdd.validateEvenOdd(11));
	}
}
