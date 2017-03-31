package marsRover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class PlateauTest {
	private Plateau plateau;
	
	@Before
	public void setUp() throws Exception{
		plateau = new Plateau();
		plateau.setMaxX(6);
		plateau.setMaxY(9);
	}
	@Test
	public void testSetMaxX() {
		plateau.setMaxX(3);
		assertEquals(3, plateau.getMaxX());
	}

	@Test
	public void testSetMaxY() {
		plateau.setMaxY(1);
		assertEquals(1, plateau.getMaxY());
	}

	@Test
	public void testGetMaxX() {
		int actual = plateau.getMaxX();
		assertEquals(6, actual);
	}

	@Test
	public void testGetMaxY() {
		int actual = plateau.getMaxY();
		assertEquals(9, actual);
	}

}
