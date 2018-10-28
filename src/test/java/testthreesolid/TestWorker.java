package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private Worker w = new Worker();
	
   @Test
   @DisplayName("Basic Test")
   public void testWorker()
   {
      assertNotNull(w);
      assertEquals(w.work(),"Doing work at a normal pace and normal quality");
      assertEquals(w.eat(), "Eating a generic lunch");
      assertEquals(w.sick(), "Having a generic illness");
   }
   @Test
   @DisplayName("Successful Michael Test")
   public void newtestMCGWorkerPass()
   {
      assertEquals(w.checkPay(), 100);
   }

   @Test
   @DisplayName("Failure Michael Test")
   public void newtestMCGWorkerFail()
   {
      assertNull(w);
      fail("Test was destined to fail, omae wa mou shindeiru ");
   }

}
