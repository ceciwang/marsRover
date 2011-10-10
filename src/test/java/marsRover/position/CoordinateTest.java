package marsRover.position;

import marsRover.position.Coordinate;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CoordinateTest {
    @Test
    public void should_parse_string_to_coordinate(){
        Coordinate coordinate = new Coordinate("34");
        assertThat(coordinate.getXCoordinate(), is(3));
        assertThat(coordinate.getYCoordinate(),is(4));
    }

    @Test
    public void should_equal_with_same_string(){
        Coordinate coordinate1 = new Coordinate("34");
        Coordinate coordinate2 = new Coordinate("34");
        assertThat(coordinate1,equalTo(coordinate2));
    }

    @Test
    public void should_to_string(){
        Coordinate coordinate = new Coordinate("34");
        assertThat(coordinate.toString(),is("34"));
    }
}
