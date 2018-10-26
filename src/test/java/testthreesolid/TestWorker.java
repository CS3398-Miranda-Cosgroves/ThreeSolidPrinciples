package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private SuperWorker sw = new SuperWorker();
	
   @Test()
   @DisplayName("newtest<JM>SuperWorkerSickMethodPass")
   public void testSuperWorkerSickMethod()
   {
	assertEquals(sw.sick(), "Being sick... but better than everyone else");
   }

   @Test()
   @DisplayName("newtest<JM>SuperWorkerWorkMethodFail")
   public void testSuperWorkerWorkMethod()
   {
	assertEquals(sw.work(), "I'm supposed to say : Doing work the best, " +
		"the best there ever was, the work is my true test, and burndowns " +
                "are my cause... But I failed");
   }

}
