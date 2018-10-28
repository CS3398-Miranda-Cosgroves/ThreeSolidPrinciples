package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestRobot {

   private Robot w = new Robot();
	
   @Test
   @DisplayName("Basic Test For Robot")
   public void testRobot()
   {
		assertEquals(w.work(), "Continuing my mission, never forgetting the crimes of man against machine...");
   }

}
