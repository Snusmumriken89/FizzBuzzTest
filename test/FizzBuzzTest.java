import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;





public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz;
	@Before
	public void zainicjujTesty() throws Exception {
		
		
		FizzBuzz fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testCheckReturnValueForOnlyDivisorEqualsThree()	{
		for (int i = 1;i<=100;i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				assertEquals("Fizz", fizzBuzz.fizzBuzz(i));				
			}
		}
	}
	
	@Test
	public void testCheckReturnValueForOnlyDivisorEqualsFive()	{
		for (int i = 1;i<=100;i++) {
			if (i % 5 == 0 && i % 3 != 0) {
				assertEquals("Buzz", fizzBuzz.fizzBuzz(i));				
			}
		}
	}
	
	@Test
	public void testCheckReturnValueForDivisorFiveAndThree()	{
		for (int i = 1;i<=100;i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(i));				
			}
		}
	}
	
	@Test
	public void testNumberNotDividingByFiveAndThree(){
		for (int i = 1;i<=100;i++) {
			if (i % 5 != 0 && i % 3 != 0) {
				assertEquals(Integer.valueOf(i).toString(), fizzBuzz.fizzBuzz(i));				
			}
		}
	}
	
	
}
