package marsRover.position.direction;

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
