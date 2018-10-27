package threesolid;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

    private  Robot r = new Robot();

    @Test
    @DisplayName("No Work Test")

    public void RobotsCantEat() {

        r.setboolean(0,false)
        assertEquals(r.getboolean(), 0);
        assertEquals(r.work(), "It is true, all I can do is work :(");
    }

    @Test
    @DisplayName("With Name Test")

    public void RobotsMagicallyEat() {

        r.setboolean(0,true);
        assertEquals(r.getboolean(), 0);
        assertEquals(r.work(), "I told you so :(");

    }
}