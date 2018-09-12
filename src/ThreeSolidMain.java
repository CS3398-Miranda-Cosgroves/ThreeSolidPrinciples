package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


public class ThreeSolidMain
{   

   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

            try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }

// interface segregation principle - good example
class Worker extends BaseWorker implements iEat, iSick{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}

	public void sick(){
	    //.... pretending to be sick for WoW expansion launch
    }
}

class SuperWorker extends BaseWorker implements iEat, iSick{

	@Override
    public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in lunch break
	}

	public void sick(){
	    //.... at home sick
    }
}

class Manager {
	IWorker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}

class TempWorker extends BaseWorker implements iEat, iSick{
    @Override
    public void work(){
        //.... works slower than normal
    }

    public void eat(){
        //.... eating in lunch break
    }

    public void sick(){
        //.... probably doesn't have sick time, so not faking it
    }
}

class Robot extends BaseWorker implements iReboot{
    public void work(){
        //.... does work and never gets tired or forgets the crimes of man
    }

    public void reboot(){
        //.... even robots need a break sometimes
    }
}
