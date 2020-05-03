package learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testClass {

	@Test
	void test() {
		obj obj1 = new obj();
		test test = new test();
		test.check(obj1);
		System.out.println(obj1.toString());
		
		test.check2(obj1);
		System.out.println(obj1.toString());
		fail("Not yet implemented");
	}

}
