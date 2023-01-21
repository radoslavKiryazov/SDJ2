package RobotBehaviour;

import RobotBehaviour.Strategies.AggressiveBehaviour;
import RobotBehaviour.Strategies.NeutralBehaviour;

public class Main {
    public static void main(String[] args) {
       GameBoard board = new GameBoard();
        Robot robot = new Robot("Ivailo",board);
        robot.setBehaviour(new NeutralBehaviour());
        robot.move();
    }
}