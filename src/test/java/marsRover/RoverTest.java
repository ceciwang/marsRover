package marsRover;

import marsRover.direction.North;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverTest {

    private Rover rover;

    @Before
    public void setUp() {
        rover = new Rover();
        rover.setCoordinate("3,4");
        rover.setDirection("N");
    }

    @Test
    public void should_set_the_coordinate() {
        assertThat(rover.getCoordinate(), is(new Coordinate("3,4")));
    }

    @Test
    public void should_set_the_direction() {
        assertThat(rover.getDirection(),is(North.class));
    }

}

