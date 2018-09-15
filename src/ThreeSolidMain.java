package threesolid;

public class ThreeSolidMain {
    public static Manager tsManager;

    public ThreeSolidMain() {
        }

        public static void main(String[] var0) {
            try {
                System.out.format("Starting ... \n");	
                Worker worker1 = new Worker();  //creates object of class Worker
            	Robot robot1 = new Robot();
            	SuperWorker superWorker1 = new SuperWorker();
            	ProjectManager projectManager1 = new ProjectManager();
            	ProductManager productManager1 = new ProductManager();
            	TempWorker tempWorker1 = new TempWorker();
            	BaseWorker baseWorker1 = new BaseWorker():
            	
            	
            	projectManager1.schedulework();
            	productManager1.defineproduct();
            	tempWorker1.work();
            	worker1.eat();
            	worker1.sick();
            	superWorker1.eat();
            	superWorker1.sick();
            	superWorker1.work();
            	baseWorker1.eat();
            	baseWorker1.sick();
            	robot1.reboot();
            	baseWorker1.reboot();
            } catch (Exception var3) {
                var3.printStackTrace();
            }

            try {
                System.out.format("Stopping ... \n");
            } catch (Exception var2) {
                var2.printStackTrace();
            }

            System.exit(0);
        }
}
