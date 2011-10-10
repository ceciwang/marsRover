package marsRover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CommandsTest {
    @Test
    public void should_create_return_size(){
        Commands commands = new Commands("LMR");
        assertThat(commands.size(),is(3));
    }

}
