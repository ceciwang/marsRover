package marsRover.position.direction;

public class South implements Direction {
    public Direction turnLeft() {
        return new East();
    }
    public Direction turnRight() {
        return new West();
    }

    public int[] moveSteps() {
        return new int[]{0,-1};
    }

    public String toString(){
        return "S";
    }

}
