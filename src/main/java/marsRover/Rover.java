package marsRover;

import marsRover.direction.Direction;

public class Rover {

    private Coordinate coordinate;
    private Direction direction;

    public void setCoordinate(String s) {
        this.coordinate = new Coordinate(s);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setDirection(String direction) {
        DirectionFactory directionFactory = new DirectionFactory();
        this.direction = directionFactory.createDirection(direction);
    }

    public Direction getDirection() {
        return direction;
    }
}
