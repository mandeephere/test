import junit.framework.TestCase;

public class MarsRoversTest extends TestCase {
	
	public void testInstructionL() {
		Rover rover = new Rover(1, 1, 'N');
		rover.processInstructionString("L");
		String expected = "1 1 W";
		String actual = rover.toString();
		assertEquals(expected, actual);
	}
	
	public void testInstructionR() {
		Rover rover = new Rover(1, 1, 'N');
		rover.processInstructionString("R");
		String expected = "1 1 E";
		String actual = rover.toString();
		assertEquals(expected, actual);
	}
	
	public void testInstructionM() {
		Rover rover = new Rover(1, 1, 'N');
		rover.processInstructionString("M");
		String expected = "1 2 N";
		String actual = rover.toString();
		assertEquals(expected, actual);
	}
}
