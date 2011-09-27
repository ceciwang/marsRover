package marsRover.direction;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WestTest {
    private West direction;

    @Before
    public void setUp(){
        direction = new West();
    }

    @Test
    public void should_change_the_direction_if_turn_left() {
        assertThat(direction.turnLeft(),is(South.class));
    }

    @Test
    public void should_change_the_direction_if_turn_right() {
        assertThat(direction.turnRight(),is(North.class));
    }

}
