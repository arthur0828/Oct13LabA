package age;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAge {

	@Test
	void test() {
		
		Outside outside = new Outside();
		int expect = 28; 
		int actual = outside.a;
		assertEquals(expect, actual);
	}
	
	@Test 
	void testInner () {
		Outside outside = new Outside ();
		Outside.Inside inner = outside.new Inside();
		//int actual = inner.b;
		assertEquals(38, inner.b);
		
	}

}
