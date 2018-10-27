package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class newtestLTS25TestManagerPass {

   private Manager m = new Manager();
	
   @Test
   @DisplayName("Manager Test")
   public void testManager()
   {
	  m.setName("Phill");
      assertEquals(m.getName(), "Phill");
      assertEquals(m.work(), "Manager class is in the work method... \n");
      //assertEquals(m.sick(), "Having a generic illness");
   }
}