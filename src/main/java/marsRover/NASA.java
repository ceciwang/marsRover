package marsRover;

import marsRover.IO.InputReader;

import java.io.FileReader;
import java.io.IOException;

public class NASA {
    public static void main(String[] args) throws IOException {
        InputReader inputReader = new InputReader(new FileReader("input.txt"));
        String input = inputReader.getUserInput();
        InputParser inputParser = new InputParser();
        Rovers rovers = inputParser.parse(input);
        for (Rover rover : rovers.getRovers()) {
            rover.execute();
            System.out.println(rover.getPosition().toString());
        }
    }
}
