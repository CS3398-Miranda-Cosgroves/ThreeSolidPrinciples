package threesolid;

<<<<<<< HEAD
public class Manager extends BaseWorker implements{
	
	Manager() {
    }
	
=======
class Manager extends BaseWorker {

>>>>>>> 23bf9d976f13d09ff7f68d7c4f04576b8e4bfe40
	@Override
	public void work(){
		//managing
		System.out.format("Manager class is in the work method... \n"); 
	}
	
	public void manage(){
		System.out.format("Manager class is in the manage method... \n"); 
	}
}