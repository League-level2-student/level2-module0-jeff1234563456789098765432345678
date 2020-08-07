package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5]; 
	//3. use a for loop to initialize the robots.
	
for (int i = 0; i < robots.length; i++) {

robots[i] = new Robot(); 
robots[i].setY(540);
robots[i].setX(100+(i*100));
robots[i].setSpeed(150);

	
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.


	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
boolean raceInProgress=true;
boolean firstRobot=false;
int WinningRobot = -1;
	while(raceInProgress) {
		for (int i = 0; i < robots.length; i++) {
			if(robots[i].getY()<0 ) {
				raceInProgress =false;
				WinningRobot = i;
				JOptionPane.showMessageDialog(null, "The winning robot is robot number "+WinningRobot+"!");
				robots[WinningRobot].setSpeed(100);
				robots[WinningRobot].turn(180);
				robots[WinningRobot].move(25);
				robots[WinningRobot].turn(180);
				break;
				
				
				
				
			}
			
			Random rand = new Random();
			int p = rand.nextInt(50);
			robots[i].move(p);
			robots[i].setSpeed(150);
			
		}
	}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
