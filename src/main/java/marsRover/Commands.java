package marsRover;

import java.util.ArrayList;
import java.util.List;

public class Commands {
    private List<Command> commands;

    public Commands(String s) {
        ArrayList<Command> commandArrayList = new ArrayList<Command>();
        for (int i = 0; i < s.length(); i++) {
            Command command = new Command(s.substring(i, i + 1));
            commandArrayList.add(command);
        }
        this.commands = commandArrayList;
    }

    public int size() {
        return commands.size();
    }
}
