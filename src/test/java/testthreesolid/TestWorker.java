package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private SuperWorker sw = new SuperWorker();
	
   @Test()
   @DisplayName("newtest<JM>SuperWorker Sick Method Test")
   public void testSuperWorkerSickMethod()
   {
	if(assertEquals(sw.sick(), "Being sick... but better than everyone else")) {
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("\\\\\\\\\\\\THE TEST PASSED!!!\\\\\\\\\\\\");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}
   }

}
