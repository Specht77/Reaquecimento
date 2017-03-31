package marsRover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoverTest {
	private Rover rover;
	@Before
	public void setUp() throws Exception{
		rover = new Rover();
		rover.setDropCoord(1, 2, 'N');
	}
	@Test
	public void testSetDropCoord()  throws Exception {
		rover.setDropCoord(2, 3, 'E');
		assertEquals(2, rover.getCoordX());
		assertEquals(3, rover.getCoordY());
		assertEquals('E', rover.getDirection());
	}

	@Test
	public void testGetDirection()  throws Exception {
		char actual = rover.getDirection();
		assertEquals('N', actual);
	}

	@Test
	public void testGetCoordX()  throws Exception {
		int actual = rover.getCoordX();
		assertEquals(1, actual);
	}

	@Test
	public void testGetCoordY()  throws Exception {
		int actual = rover.getCoordY();
		assertEquals(2, actual);
	}

	@Test
	public void testSpin()  throws Exception {
		rover.spin('L');
		assertEquals('W', rover.getDirection());
	}

	@Test
	public void testMove()  throws Exception {
		rover.move('N');
		assertEquals(3, rover.getCoordY());
	}

}
