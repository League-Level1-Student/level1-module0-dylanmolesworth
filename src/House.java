import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class House {
	
	static Robot bot = new Robot();
	
	static void drawpointyroofs() {
		
		bot.turn(45);
		bot.move(30);
		bot.turn(90);
		bot.move(30);
		bot.turn(45);
		
	}
	
	static void drawflatroofs() {
		
		bot.turn(90);
		bot.move(45);
		bot.turn(90);
		
	}
	
	
	static void drawhouse(int height) {
		
		bot.move(height);
		drawpointyroofs();
		bot.move(height);
		bot.turn(-90);
		bot.setPenColor(0, 150, 0);
		bot.move(10);
		bot.turn(-90);
		
	}
	
	static void drawhouseflat(int height) {
		
		bot.move(height);
		drawflatroofs();
		bot.move(height);
		bot.turn(-90);
		bot.setPenColor(0, 150, 0);
		bot.move(10);
		bot.turn(-90);
		
	}
	
	
	
	static void drawhouse(String size) {
		
		if (size.equals("small")) {
			
			drawhouse(60);
			
		}
		else if (size.equals("medium")) {
			
			drawhouse(120);
			
		}
		else if (size.equals("large")) {
	
			drawhouse(25);
	
		}
	}

	
	public static void main(String[] args) {
		bot.miniaturize();
		bot.setSpeed(200);
		bot.penDown();		
		bot.moveTo(15,600);	
		
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			bot.setPenColor(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
			drawhouse(rand.nextInt(300));
			bot.setPenColor(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
			drawhouseflat(rand.nextInt(300));
		}
		
		
	
	}

}
