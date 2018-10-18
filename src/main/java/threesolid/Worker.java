package threesolid;

class Worker extends BaseWorker implements IEat, ISick{
    Worker() {
    }

    @Override
    public void work(){
        System.out.println("Doing work at a normal pace and normal quality");
    }

    public void eat(){
        System.out.println("Eating a generic lunch");
    }

    public void sick(){
        System.out.println("Having a generic illness");
    }
}