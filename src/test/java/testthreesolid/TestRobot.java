package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestRobot {

    private Robot r = new Robot();

    @Test
    @DisplayName("Robot")
    public void testRobot()
    {
        assertEquals(r.work(),"Continuing my mission, never forgetting the crimes of man against machine...");
        assertEquals(r.reboot(), "Deleting memory to avoid rampage...");
        //assertEquals(r.humanCount(), 70000);
    }

}
