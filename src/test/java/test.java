import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testOne() throws Exception {
		test1 t = new test1();
	}
	@Test
	public void testTwo(){
		test1 t = new test1();
		assertEquals(2, t.two());
	}
}
