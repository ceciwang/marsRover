package marsRover;

import java.util.ArrayList;

public class InputParser {

    public static final int LEAST_LENGTH_OF_STRING_FOR_ONE_ROVER = 3;
    public static final int ALIAS_OF_COMMAND_STRING = 3;

    public Rovers parse(String inputString) {

        ArrayList<Integer> startPointsOfRovers = getStartIndexOfAllRovers(inputString);
        Rovers rovers = createRoversFromInputString(inputString, startPointsOfRovers);
        return rovers;
    }

    private Rovers createRoversFromInputString(String inputString, ArrayList<Integer> startPointsOfRovers) {
        Rovers rovers = new Rovers();
        for (int eachStartPoint = 0; eachStartPoint < startPointsOfRovers.size(); eachStartPoint++) {
            Rover rover = createRover(inputString, startPointsOfRovers, eachStartPoint);
            rovers.add(rover);
        }
        return rovers;
    }

    private Rover createRover(String inputString, ArrayList<Integer> startPointsOfRovers, int eachStartPoint) {
        Rover rover = new Rover();
        Integer indexInInputString = startPointsOfRovers.get(eachStartPoint);
        rover.setPosition(inputString.substring(indexInInputString, indexInInputString + ALIAS_OF_COMMAND_STRING));
        rover.setCommands(getCommandString(inputString, startPointsOfRovers, eachStartPoint, indexInInputString));
        return rover;
    }

    private String getCommandString(String inputString, ArrayList<Integer> indexOfRovers, int eachStartPoint, Integer indexInInputString) {
        return hasNextRover(indexOfRovers, eachStartPoint) ? inputString.substring(indexInInputString + ALIAS_OF_COMMAND_STRING, indexOfRovers.get(eachStartPoint + 1)):inputString.substring(indexInInputString + ALIAS_OF_COMMAND_STRING);
    }

    private boolean hasNextRover(ArrayList<Integer> indexOfRovers, int eachStartPoint) {
        return eachStartPoint < indexOfRovers.size()-1;
    }

    private ArrayList<Integer> getStartIndexOfAllRovers(String inputString) {
        ArrayList<Integer> startPointsOfRovers = new ArrayList<Integer>();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                startPointsOfRovers.add(i);
                i = i + LEAST_LENGTH_OF_STRING_FOR_ONE_ROVER;
            }
        }
        return startPointsOfRovers;
    }

    public RoverRunners parseToRunner(String s) {
        return new RoverRunners(parse(s));
    }
}
