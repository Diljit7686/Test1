import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class  SnakeTest {

	private Snake peter;
	private Snake takis;
	
	@Before
	public void setUp() throws Exception {
		// jjjjj
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	}
	
	@Test
	public void testIsHealthyTrue() {
		assertTrue(takis.isHealthy());
		
	}
	
	@Test
	public void testIsHealthyFalse() {
		assertFalse(peter.isHealthy());
		
	}
	
	@Test
	public void fitsInCageTrue() {
		assertTrue(peter.fitsInCage(11));
		
	}
	
	@Test
	public void fitsInCageFalseEquals() {
		assertFalse(peter.fitsInCage(10));
		
	}
	
	@Test
	public void fitsInCageFalseSmall() {
		assertFalse(peter.fitsInCage(9));
		
		
	}

}