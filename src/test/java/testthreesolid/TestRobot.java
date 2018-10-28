package threesolid;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

    private  Robot r = new Robot();

    @Test
    @DisplayName("Robots Can't Eat Test")

    public void RobotsOnlyWork() {

        assertEquals(r.work(), "It is true, all I can do is work :(");
    }
}
