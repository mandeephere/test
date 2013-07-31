/**
 * This class describes a Rover and provides methods to manipulate
 * the movements of the Rover
 * @author MANDEEP
 */
public class Rover {
	
	// Attributes
	private int x;
	private int y;
	private char direction;
	
	// Default constructor
	public Rover() {
		super();
	}
	
	/**
	 * Overloaded constructor
	 * 
	 * @param xCoord - initializes the x value
	 * @param yCoord - initializes the y value
	 * @param dir - initializes the direction
	 */
	public Rover(int xCoord, int yCoord, char dir) {
		setX(xCoord);
		setY(yCoord);
		setDirection(dir);
	}
	
	// Getters and Setters
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getDirection() {
		return direction;
	}
	public void setDirection(char direction) {
		this.direction = direction;
	}
	
	/**
	 * This method processes each character of the instruction string and 
	 * navigates the rover accordingly
	 * @param instructionString
	 */
	public void processInstructionString(String instructionString) {
		
		for(int i = 0; i < instructionString.length(); i++) {
			char instruction = instructionString.charAt(i);
			
			switch (instruction) {
				case 'L':
					switch (getDirection()) {
						case 'N': 
							setDirection('W');
							break;
						case 'S': 
							setDirection('E');
							break;
						case 'E': 
							setDirection('N');
							break;
						case 'W': 
							setDirection('S');
							break;
					}
					break;
					
				case 'R':
					switch (getDirection()) {
						case 'N': 
							setDirection('E');
							break;
						case 'S': 
							setDirection('W');
							break;
						case 'E': 
							setDirection('S');
							break;
						case 'W': 
							setDirection('N');
							break;
					}
					break;
					
				case 'M':
					switch (getDirection()) {
						case 'N': 
							setY(++y);
							break;
						case 'S': 
							setY(--y);
							break;
						case 'E': 
							setX(++x);
							break;
						case 'W': 
							setX(--x);
							break;
					}
					break;
			}
		}
	}
	
	/**
	 * Overridden toString() method to return meaningful value of Rover object
	 */
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		sbf.append(getX());
		sbf.append(" ");
		sbf.append(getY());
		sbf.append(" ");
		sbf.append(getDirection());
		return sbf.toString();
	}
}
