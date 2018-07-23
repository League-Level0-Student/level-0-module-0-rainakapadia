package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot name = new Robot();
		name.penDown();
		name.setSpeed(200);

		name.move(150);

		for (int i = 0; i < 3; i++) {
			name.turn(90);
			name.move(50);
		}

		for (int i = 0; i < 1; i++) {
			name.turn(-135);
			name.move(100);
	}

}
}
