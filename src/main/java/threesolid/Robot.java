package threesolid;

class Robot extends BaseWorker implements IReboot{
    Robot() {
    }
    @Override
    public void work() {
        System.out.println("Continuing my mission, never forgetting the crimes of man against machine...");
    }

    public void reboot()
    {
        System.out.println("Deleting memory to avoid rampage...");
    }
}