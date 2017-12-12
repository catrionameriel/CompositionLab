import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Apple", "AA202", "Wireless",12);
    }

    @Test
    public void delete(){
        assertEquals("You have deleted: Z", keyboard.delete("Z"));
    }

    @Test
    public void type(){
        assertEquals("ZZZZ", keyboard.type("ZZZZ"));
    }
}
