package threesolid;

public class Manager extends BaseWorker {
	
	Manager() {
    }
	
	@Override
	public void work(){
		System.out.format("Manager class is in the work method... \n"); 
	}
	
	public void manage(){
		System.out.format("Manager class is in the manage method... \n"); 
	}
	
}
