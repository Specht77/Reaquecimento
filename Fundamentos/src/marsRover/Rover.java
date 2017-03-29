package marsRover;

public class Rover {
	private int coordX;
	private int coordY;
	private char direction;
	public Rover(){
		coordX = 0;
		coordY = 0;
		direction = 'N';
	}

	public void setDropCoord(int dropX, int dropY, char dropDir){
		coordX = dropX;
		coordY = dropY;
		direction = dropDir;
	}

	public char getDirection(){
		return direction;
	}
	
	public int getCoordX(){
		return coordX;
	}
	
	public int getCoordY(){
		return coordY;
	}

	public void spin(char leftright){
		if ((leftright == 'L') && (direction == 'N')){
			direction = 'W';
			return;
		}
		if ((leftright == 'L') && (direction == 'W')){
			direction = 'S';
			return;
		}
		if ((leftright == 'L') && (direction == 'S')){
			direction = 'E';
			return;
		}
		if ((leftright == 'L') && (direction == 'E')){
			direction = 'N';
			return;
		}
		
		
		if ((leftright == 'R') && (direction == 'N')){
			direction = 'E';
			return;
		}
		if ((leftright == 'R') && (direction == 'E')){
			direction = 'S';
			return;
		}
		if ((leftright == 'R') && (direction == 'S')){
			direction = 'W';
			return;
		}
		if ((leftright == 'R') && (direction == 'W')){
			direction = 'N';
			return;
		}
		
		
		
		
	}

	public void move(char newDir){
		direction = newDir;
		if ((direction == 'N') && (coordY != Plateau.getMaxY())){
			coordY = coordY + 1;
		}
		if ((direction == 'E') && (coordX != Plateau.getMaxX())){
			coordX = coordX + 1;
		}
		if ((direction == 'S') && (coordY != 0)){
			coordY = coordY - 1;
		}
		if ((direction == 'W') && (coordX != 0)){
			coordX = coordX - 1;
		}
	}
}
