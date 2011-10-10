package marsRover.position;

import marsRover.position.direction.Direction;
import marsRover.position.direction.DirectionFactory;

public class Position {
    private Coordinate coordinate;
    private Direction direction;

    public Position(String status) {
        this.coordinate = new Coordinate(status);
        DirectionFactory directionFactory = new DirectionFactory();
        this.direction = directionFactory.createDirection(status.substring(2));
    }

    public Direction getDirection() {
        return direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (coordinate != null ? !coordinate.equals(position.coordinate) : position.coordinate != null) return false;
        if (direction != null ? !direction.toString().equals(position.direction.toString()) : position.direction != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coordinate != null ? coordinate.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return coordinate + "" + direction;
    }

    public void update(String command) {
        if (command.equalsIgnoreCase("L")) {
            this.direction = direction.turnLeft();
        } else if (command.equalsIgnoreCase("R")) {
            this.direction = direction.turnRight();
        } else if (command.equalsIgnoreCase("M")) {
            updateCoordinate();
        }
    }

    private void updateCoordinate() {
        coordinate.move(direction.moveSteps());
    }
}
