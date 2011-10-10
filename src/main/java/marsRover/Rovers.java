package marsRover;

import java.util.ArrayList;

public class Rovers {
    private ArrayList<Rover> rovers;

    public Rovers(ArrayList<Rover> roverList) {
        this.rovers = roverList;
    }

    public Rovers() {
    }

    public ArrayList<Rover> getRovers(){
        return rovers;
    }

    public int size() {
        return rovers.size();
    }

    public Rover get(int index) {
        return rovers.get(index);
    }

    public void add(Rover rover) {
        this.rovers.add(rover);
    }
}
