package RobotBehaviour;

import RobotBehaviour.Strategies.Behaviour;
import RobotBehaviour.Strategies.NeutralBehaviour;

import java.awt.*;
import java.awt.geom.Point2D;

public class Robot {
    private String name;
    private Behaviour behaviour;
    private GameBoard board;

    public Robot(String name,GameBoard board){
        name = this.name;
        behaviour = new NeutralBehaviour();
        this.board =board;
    }
    public Behaviour getBehaviour(){
        return behaviour;
    }
    public void setBehaviour(Behaviour behaviour){
        this.behaviour = behaviour;
    }
    public void move(){
        behaviour.moveCommand(board,new Point2D.Double(2,3));
    }
}
