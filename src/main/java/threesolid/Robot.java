package threesolid;

class Robot extends BaseWorker implements IReboot{
    Robot() {
    }
    @Override
    public String work() {
        return "Continuing my mission, never forgetting the crimes of man against machine...";
    }
    public int humanCount()
    {
        return 0;
    }
    public String reboot()
    {
        return "Deleting memory to avoid rampage...";
    }
}