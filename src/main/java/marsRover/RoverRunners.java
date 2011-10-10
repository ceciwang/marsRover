package marsRover;

public class RoverRunners {
    private Rovers rovers;
    public RoverRunners(Rovers rovers) {
        this.rovers = rovers;
    }

    public int size() {
        return rovers.size();
    }
}
