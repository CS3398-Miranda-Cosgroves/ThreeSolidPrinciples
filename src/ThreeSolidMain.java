package threesolid;

public class ThreeSolidMain {
    public static Manager tsManager = new Manager();

    public ThreeSolidMain() {
        }

        public static void main(String[] var0) {
            try {
                System.out.format("Starting ... \n");
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
