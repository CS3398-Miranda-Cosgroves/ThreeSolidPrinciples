package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestProjectManager {

   private ProjectManager pm = new ProjectManager();
	
   @Test
   @DisplayName("Manager Test")
   public void testProjectManager()
   {
	  pm.setName("Phill");
      assertEquals(pm.getName(), "Phill");
      assertEquals(pm.work(), "Manager class is in the work method... \n");
      //assertEquals(m.sick(), "Having a generic illness");
   }
}