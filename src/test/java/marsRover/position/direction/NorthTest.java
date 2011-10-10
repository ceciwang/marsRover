package marsRover.position.direction;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NorthTest {

    private North direction;

    @Before
    public void setUp(){
        direction = new North();
    }

    @Test
    public void should_change_the_direction_if_turn_left() {
        assertThat(direction.turnLeft(),is(West.class));
    }

    @Test
    public void should_change_the_direction_if_turn_right() {
        assertThat(direction.turnRight(),is(East.class));
    }

}
