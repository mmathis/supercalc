package supercalc;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import supercalc.Adder;


public class AdderTest {

	Adder adder = new Adder();;
	
	@Test
	public void add() {

		assertEquals(Integer.valueOf(7), adder.add(5, 2));
	}
	
	@Test
	public void negative() {

		assertEquals(Integer.valueOf(-3), adder.add(-5, 2));
	}
}
