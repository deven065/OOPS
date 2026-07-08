package interfaces;

public class Main {
    static void main() {
//        Car car = new Car();

//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Media();
//        carMedia.start();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
