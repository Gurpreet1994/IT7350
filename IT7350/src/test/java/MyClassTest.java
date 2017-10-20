import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
 MyClass obj;
 int a, b; 
	@Before
	public void setUp() throws Exception {
		 obj = new MyClass() ; //initialize and instantiate the object 

         a = 25; 

         b = 22;

         }


	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		  assertEquals((a + b), obj.sum(a, b));
		
	}

}
