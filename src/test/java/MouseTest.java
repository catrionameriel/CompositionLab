import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {
    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("Apple", "AA101", "Corded", 1);
    }

    @Test
    public void canMove(){
        assertEquals("weeeeee!", mouse.move());
    }

    @Test
    public void canClick(){
        assertEquals("You have selected: Slack", mouse.click("Slack"));
    }
}
