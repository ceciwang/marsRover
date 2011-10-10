package marsRover.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class InputReader {

    private String  input;
    private Reader reader;

    public InputReader(Reader reader) {
        this.reader = reader;
    }

    public String getUserInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        input = connectAllInputLine(bufferedReader);
        return input;
    }

    private String  connectAllInputLine(BufferedReader bufferedReader) throws IOException {
        StringBuilder inputString = new StringBuilder();
        String inputLine = "";
        while ((inputLine = bufferedReader.readLine()) != null) {
            inputString.append(inputLine);
        }
        return inputString.toString();
    }
}
