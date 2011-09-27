package marsRover.direction;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SouthTest {
    private South direction;

    @Before
    public void setUp(){
        direction = new South();
    }

    @Test
    public void should_change_the_direction_if_turn_left() {
        assertThat(direction.turnLeft(),is(East.class));
    }

    @Test
    public void should_change_the_direction_if_turn_right() {
        assertThat(direction.turnRight(),is(West.class));
    }

}
