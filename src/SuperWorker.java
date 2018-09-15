package threesolid;

class SuperWorker extends BaseWorker implements IEat, ISick{
    SuperWorker() {
        @Override
        public void work(){
            System.out.println("Doing work the best, the best there ever was, the work is my true test, and burndowns are my cause.");
        }

        public void eat(){
            System.out.println("Eating meal... but better than everyone else.");
        }

        public void sick(){
            System.out.println("Being sick... but better than everyone else");
        }
    }
}