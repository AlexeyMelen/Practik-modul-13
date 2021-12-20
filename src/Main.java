public class Main {

    public static void main(String[] args) {

        Egg egg = new Egg();
        System.out.println("Начинаем спор : кто появился первым ?");

        egg.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(ChickenEgg.getTimeSleep());
                System.out.println("Курица");
            } catch (InterruptedException e) {
            }
        }
        if (egg.isAlive()) {
            try {
                egg.join();
            } catch (InterruptedException e) {
            }

            System.out.println("Первым появилось яйцо !!!");
        } else {
            System.out.println("Первой появилась курица !!!");
        }
        System.out.println("Спор закончен");
    }
}