package marsRover.direction;

public class North extends Direction {
    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }
}
