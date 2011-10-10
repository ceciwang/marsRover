package marsRover.position.direction;

public class North implements Direction {
    public Direction turnLeft() {
        return new West();
    }

    public Direction turnRight() {
        return new East();
    }
    public String toString(){
        return "N";
    }

    public int[] moveSteps() {
        return new int[]{0,1};
    }


}
