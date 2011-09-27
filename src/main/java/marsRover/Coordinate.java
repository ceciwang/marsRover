package marsRover;

public class Coordinate {
    private String xCoordinate;
    private String yCoordinate;

    public Coordinate(String s) {
        String[] strings = s.split(",");
        this.xCoordinate = strings[0];
        this.yCoordinate= strings[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (xCoordinate != null ? !xCoordinate.equals(that.xCoordinate) : that.xCoordinate != null) return false;
        if (yCoordinate != null ? !yCoordinate.equals(that.yCoordinate) : that.yCoordinate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xCoordinate != null ? xCoordinate.hashCode() : 0;
        result = 31 * result + (yCoordinate != null ? yCoordinate.hashCode() : 0);
        return result;
    }

    public String getXCoordinate() {
        return xCoordinate;
    }

    public String getYCoordinate() {
        return yCoordinate;
    }
}
