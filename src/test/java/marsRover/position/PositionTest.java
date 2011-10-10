package marsRover.position;

import marsRover.position.direction.North;
import marsRover.position.Position;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PositionTest {
    @Test
    public void should_set_the_direction() {
        Position position = new Position("67N");
        assertThat(position.getDirection(),is(North.class));
    }

    @Test
    public void should_set_the_coordinate() {
        Position position = new Position("67N");
        assertThat(position.getCoordinate().toString(), is("67"));
    }

    @Test
    public void should_equal(){
        Position position1 = new Position("67N");
        Position position2 = new Position("67N");
        assertThat(position1,equalTo(position2));
    }

    @Test
    public void should_to_string(){
        Position position = new Position("67N");
        assertThat(position.toString(),is("67N"));
    }

    @Test
    public void should_update_according_to_commands(){
        Position position = new Position("67N");
        position.update("L");
        assertThat(position.getDirection().toString(),is("W"));
    }


}
