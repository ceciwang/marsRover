package marsRover.position.direction;

public class West implements Direction {
    public Direction turnLeft() {
        return new South();
    }
    public Direction turnRight() {
        return new North();
    }
    public String toString(){
        return "W";
    }
    public int[] moveSteps() {
        return new int[]{-1,0};
    }

}
