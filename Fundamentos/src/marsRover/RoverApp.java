package marsRover;

import java.util.Scanner;


public class RoverApp {

	public static void main(String[] args) {
		Plateau plateau = new Plateau();
		Rover rover1 = new Rover();
		Rover rover2 = new Rover();
		
		Scanner scanPlatMax = new Scanner(System.in).useDelimiter("\\s*");
		int inputX = scanPlatMax.nextInt();
		int inputY = scanPlatMax.nextInt();
		plateau.setMaxX(inputX);
		plateau.setMaxY(inputY);
		System.out.println(plateau.getMaxX());
		System.out.println(plateau.getMaxY());
		
		
		Scanner scanDrop1 = new Scanner(System.in).useDelimiter("\\s*");
		int dropX1 = scanDrop1.nextInt();
		int dropY1 = scanDrop1.nextInt();
		char dropDir1 = scanDrop1.next().charAt(0);
		rover1.setDropCoord(dropX1, dropY1, dropDir1);
		System.out.println(rover1.getCoordX());
		System.out.println(rover1.getCoordY());
		System.out.println(rover1.getDirection());



		
		Scanner scanTasks1 = new Scanner(System.in);
		String line = scanTasks1.nextLine();
		for(int charIndex = 0; charIndex < line.length(); charIndex++){
			char cmd = line.charAt(charIndex);
			System.out.println((rover1.getCoordX())+ "" + (rover1.getCoordY())+ "" +(rover1.getDirection()));
			System.out.println(cmd);
			switch(cmd){
			case 'M':
				rover1.move(rover1.getDirection());
				break;
			case 'L':
			case 'R':
				rover1.spin(cmd);
				break;
			}
		}
		System.out.println((rover1.getCoordX())+ "" + (rover1.getCoordY())+ "" +(rover1.getDirection()));
		
		Scanner scanDrop2 = new Scanner(System.in).useDelimiter("\\s*");
		int dropX2 = scanDrop2.nextInt();
		int dropY2 = scanDrop2.nextInt();
		char dropDir2 = scanDrop2.next().charAt(0);
		rover2.setDropCoord(dropX2, dropY2, dropDir2);
		System.out.println(rover2.getCoordX());
		System.out.println(rover2.getCoordY());
		System.out.println(rover2.getDirection());
		
		Scanner scanTasks2 = new Scanner(System.in);
		String line2 = scanTasks2.nextLine();
		for(int charIndex = 0; charIndex < line.length(); charIndex++){
			char cmd = line2.charAt(charIndex);
			System.out.println((rover2.getCoordX())+ "" + (rover2.getCoordY())+ "" +(rover2.getDirection()));
			System.out.println(cmd);
			switch(cmd){
			case 'M':
				rover2.move(rover2.getDirection());
				break;
			case 'L':
			case 'R':
				rover2.spin(cmd);
				break;
			}
		}
		System.out.println((rover2.getCoordX())+ "" + (rover2.getCoordY())+ "" +(rover2.getDirection()));
		



	}

}
