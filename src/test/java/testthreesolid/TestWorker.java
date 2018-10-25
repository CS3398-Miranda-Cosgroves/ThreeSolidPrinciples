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
      assertEquals(w.work(),"Doing work at a normal pace and normal quality");
      assertEquals(w.eat(), "Eating a generic lunch");
      assertEquals(w.sick(), "Having a generic illness");
   }

}