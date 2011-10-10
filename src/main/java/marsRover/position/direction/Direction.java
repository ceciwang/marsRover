package marsRover.position.direction;

public interface Direction {

    String toString();
    Direction turnLeft();
    Direction turnRight();

    int[] moveSteps();
}



