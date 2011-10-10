package marsRover;

import marsRover.position.Position;

import java.util.ArrayList;

public class Rover {

    private ArrayList<String> commands;
    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(String s) {
        this.position = new Position(s);
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(String commandString) {
        ArrayList<String> commands = new ArrayList<String>();
        for (int i = 0; i < commandString.length(); i++) {
            commands.add(commandString.substring(i, i + 1));
        }
        this.commands = commands;
    }

    public void execute() {
        for (String command : commands) {
            position.update(command);
        }
    }
}
