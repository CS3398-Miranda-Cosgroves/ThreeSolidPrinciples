package threesolid;

class SuperWorker extends BaseWorker implements IEat, ISick{
    SuperWorker() {
    }

    @Override
    public String work(){
        return "Doing work the best, the best there ever was, the work is my true test, and burndowns" +
                "are my cause.";
    }

    public String eat(){return "Eating meal... but better than everyone else.";
    }

    public String sick(){
        return "Being sick... but better than everyone else";
    }
}