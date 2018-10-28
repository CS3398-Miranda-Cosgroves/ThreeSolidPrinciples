package threesolid;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestRobot {

    private  Robot r = new Robot();

    @Test
    @DisplayName("Robots Can't Eat Test")

    public void RobotsOnlyWork() {

        assertEquals(r.work(), "Continuing my mission, never forgetting the crimes of man against machine...");
    }
}
