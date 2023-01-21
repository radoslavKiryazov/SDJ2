package RobotBehaviour.Strategies;

import RobotBehaviour.GameBoard;

import java.awt.geom.Point2D;

public class DefensiveBehaviour implements Behaviour{
    @Override
    public int moveCommand(GameBoard board, Point2D robotLocation) {
        System.out.print("Defensive Behaviour");
        return -1;
    }
}
