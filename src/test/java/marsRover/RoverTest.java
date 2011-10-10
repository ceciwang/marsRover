package marsRover;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverTest {

    private Rover rover;

    @Before
    public void setUp() {
        rover = new Rover();
        rover.setPosition("34N");
    }

    @Test
    public void should_update_position_when_turn_left(){
        rover.setCommands("L");
        rover.execute();
        assertThat(rover.getPosition().toString(),is("34W"));
    }
    @Test
    public void should_update_position_when_turn_right(){
        rover.setCommands("R");
        rover.execute();
        assertThat(rover.getPosition().toString(), is("34E"));
    }

    @Test
    public void should_update_position_when_move(){
        rover.setCommands("M");
        rover.execute();
        assertThat(rover.getPosition().toString(), is("35N"));
    }

    @Test
    public void should_execute_multiple_commands(){
        rover.setPosition("12N");
        rover.setCommands("LMLMLMLMM");
        rover.execute();
        assertThat(rover.getPosition().toString(),is("13N"));
    }

}

