package threesolid;

class TempWorker extends BaseWorker implements IEat, ISick{
    TempWorker() {
    }

    @Override
    public String work(){
        return "Doing work temporarily, I am easily replaceable.";
    }

    public String eat(){
        return "Eating a meal in the hallway because I have no assigned area to eat";
    }

    public String sick(){
        return "Being sick and not getting paid since I am not here long enough for sick pay";
    }
}