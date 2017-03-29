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

	public int getDirection(){
		return direction;
	}

	public void spin(char leftright){
		if (leftright == 'L'){
			
		}
	}

	public void move(char newDir){
		direction = newDir;
		if ((direction == 'N') && (coordY != Plateau.getMaxY())){
			coordY = coordY + 1;
			if ((direction == 'E') && (coordX != 0)){
				coordX = coordX - 1;
				if ((direction == 'S') && (coordY != 0)){
					coordY = coordY - 1;
					if ((direction == 'W') && (coordX != Plateau.getMaxX())){
						coordY = coordY + 1;
					}
				}						
			}	
		}
	}
}
