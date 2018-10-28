package threesolid;

class Worker extends BaseWorker implements IEat, ISick{
    Worker() {
    }

    @Override
    public String work(){
        return "Doing work at a normal pace and normal quality";
    }

    public String eat(){
        return "Eating a generic lunch";
    }

    public String sick(){
        return "Having a generic illness";
    }

    public double checkPay()
    {
        int multiplier = 2;
        double base = 50.0;
        return base * multiplier;
    }
}