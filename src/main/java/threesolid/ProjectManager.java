package threesolid;

public class ProjectManager extends Manager{
	
	ProjectManager() {
    }
	
	@Override
	public String work() {
		return "ProjectManager class works a bit slower";
	}
	public void schedulework() {
		System.out.format("ProjectManager class is in schedulework method ... \n"); 
		//scheduling work
	}
	
}