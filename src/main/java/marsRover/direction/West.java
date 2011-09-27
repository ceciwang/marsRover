package marsRover.direction;

public class West extends Direction {
    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }
}
