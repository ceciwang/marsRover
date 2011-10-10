package marsRover;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InputParserTest {

    InputParser inputParser;

    @Before
    public void setUp() {
        inputParser = new InputParser();
    }

    @Test
    public void should_parsed_one_rover_with_coordinate_direction_and_command_info() {
        Rovers rovers = inputParser.parse("34NLMRM");
        assertThat(rovers.size(), is(1));
        assertThat(rovers.get(0).getPosition().toString(), is("34N"));
        assertThat(rovers.get(0).getCommands().size(), is(4));
    }

    @Test
    public void should_parsed_multiple_rovers_with_coordinate_direction_and_command_info() {
        Rovers rovers = inputParser.parse("12NLMLMLMLMM33EMMRMMRMRRM");
        assertThat(rovers.size(), is(2));
        assertThat(rovers.get(1).getPosition().toString(), is("33E"));
        assertThat(rovers.get(1).getCommands().size(), is(10));
        assertThat(rovers.get(0).getCommands().size(), is(9));
    }
    
    @Test
    public void should_parse_to_runner(){
        RoverRunners roverRunners = inputParser.parseToRunner("34NLMRM");
        assertThat(roverRunners.size(),is(1));
    }

}
