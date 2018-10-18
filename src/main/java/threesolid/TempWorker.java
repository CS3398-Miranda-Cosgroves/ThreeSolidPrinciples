package threesolid;

class TempWorker extends BaseWorker implements IEat, ISick{
    TempWorker() {
    }

    @Override
    public void work(){
        System.out.println("Doing work temporarily, I am easily replaceable.");
    }

    public void eat(){
        System.out.println("Eating a meal in the hallway because I have no assigned area to eat");
    }

    public void sick(){
        System.out.println("Being sick and not getting paid since I am not here long enough for sick pay");
    }
}