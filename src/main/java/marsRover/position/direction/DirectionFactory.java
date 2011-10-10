package marsRover.position.direction;

public class DirectionFactory {

    public Direction createDirection(String direction) {
        switch (direction.charAt(0)){
            case 'N':
                return new North();
            case 'S':
                return new South();
            case 'W':
                return new West();
            default:
                return new East();
        }
    }
}
