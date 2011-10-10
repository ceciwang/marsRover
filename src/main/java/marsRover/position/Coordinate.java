package marsRover.position;

public class Coordinate {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinate(String s) {
        this.xCoordinate = Integer.parseInt(s.substring(0, 1));
        this.yCoordinate = Integer.parseInt(s.substring(1, 2));
    }

    @Override
    public String toString() {
        return xCoordinate + "" + yCoordinate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (xCoordinate != that.xCoordinate) return false;
        if (yCoordinate != that.yCoordinate) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xCoordinate;
        result = 31 * result + yCoordinate;
        return result;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void move(int[] ints) {
        this.xCoordinate = xCoordinate + ints[0];
        this.yCoordinate = yCoordinate + ints[1];
    }
}
