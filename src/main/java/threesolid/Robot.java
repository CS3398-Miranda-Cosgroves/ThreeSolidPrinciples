package threesolid;

class Robot extends BaseWorker implements IReboot{
    Robot() {
    }
    @Override
    public String work() {
        return "Continuing my mission, never forgetting the crimes of man against machine...";
    }

    public void reboot()
    {
        System.out.println("Deleting memory to avoid rampage...");
    }
}