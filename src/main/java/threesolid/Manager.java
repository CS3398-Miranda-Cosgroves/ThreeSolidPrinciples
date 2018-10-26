package threesolid;

public class Manager extends BaseWorker{
	
	private String name;
	private int salary;
	
	Manager() {
    }

	public void setName(String person) {
		name = person;
	}
	
	public String getName() {
		return name;
	}
	
    @Override
    public String work(){
		//managing
		return "Manager class is in the work method... \n";
	}
	
	public void manage(){
		System.out.format("Manager class is in the manage method... \n");
	}
}