package interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engien Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engien Stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engien Accelerate");
    }
}
