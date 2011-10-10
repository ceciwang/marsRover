package marsRover.position.direction;

public class East implements Direction {
    public Direction turnLeft() {
        return new North();
    }

    public Direction turnRight() {
        return new South();
    }

    public String toString(){
        return "E";
    }

    public int[] moveSteps() {
        return new int[]{1,0};
    }

}
