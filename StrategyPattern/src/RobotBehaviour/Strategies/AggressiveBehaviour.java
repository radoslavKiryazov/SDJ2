package RobotBehaviour.Strategies;

import RobotBehaviour.GameBoard;

import java.awt.geom.Point2D;

public class AggressiveBehaviour implements Behaviour{
    @Override
    public int moveCommand(GameBoard board, Point2D robotLocation) {
        System.out.print("Aggressive Behaviour");
        return 1;
    }
}
