package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private Worker w = new Worker();
	
	
   @Test
   @DisplayName("Not Null Name Test -- PASS")
   public void testWorkerWithNameNotNulll()
   {
      w.setName("Steamboat Garrison");
      assertNotNull(w.getName(),"Steamboat Garrison");
      assertEquals(w.work(),"Doing work at a normal pace and normal quality");
   }
	
	
   @Test
   @DisplayName("Null Name Test -- FAIL")
   public void testWorkerWithNameNull()
   {
<<<<<<< HEAD
      w.setName("Craggity Jones");
=======
      w.setName("Chains Jones");
>>>>>>> 4900c0720fe0479473a81a0fabc5811604fe1863
      assertNull(w.getName(),"Chains Jones");
      assertEquals(w.work(),"Doing work at a normal pace and normal quality");
   }

}