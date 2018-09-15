package threesolid;

class Manager extends BaseWorker {

	@Override
	public void work(){
		//managing
		System.out.format("Manager class is in the work method... \n"); 
	}
	
	public void manage(){
		System.out.format("Manager class is in the manage method... \n"); 
	}
}