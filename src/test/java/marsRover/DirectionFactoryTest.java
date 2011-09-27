package marsRover;

import marsRover.direction.East;
import marsRover.direction.North;
import marsRover.direction.South;
import marsRover.direction.West;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DirectionFactoryTest {
    @Test
    public void should_return_correspond_direction_for_string(){
        DirectionFactory directionFactory = new DirectionFactory();
        assertThat(directionFactory.createDirection("N"), is(North.class));
        assertThat(directionFactory.createDirection("S"), is(South.class));
        assertThat(directionFactory.createDirection("W"), is(West.class));
        assertThat(directionFactory.createDirection("E"), is(East.class));
    }


}
