package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class newtestLTS25TestProjectManagerFail {

   private ProjectManager pm = new ProjectManager();
	
   @Test
   @DisplayName("ProjectManager Test")
   public void testProjectManager()
   {
	  pm.setName("Dill");
      assertEquals(pm.getName(), "Dill");
      assertEquals(pm.work(), "Manager class is in the work method... \n");
   }
}