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
      w.setName("Chains Jones");
      assertNull(w.getName(),"Chains Jones");
      assertEquals(w.work(),"Doing work at a normal pace and normal quality");
   }

}
