package marsRover;

public class Plateau {
	static int maxX;
	static int maxY;
	public Plateau(){
		maxX = 0;
		maxY = 0;
	}
	
	public void setMaxX(int xValue){
		maxX = xValue;
	}
	
	public void setMaxY(int yValue){
		maxY= yValue;
	}
	
	public static int getMaxX(){
		return maxX;
	}
	public static int getMaxY(){
		return maxY;
	}

}
