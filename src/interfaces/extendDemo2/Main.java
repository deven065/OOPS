package interfaces.extendDemo2;

public class Main implements A, B {
    @Override
    public void greet() {
        
    }

    static void main() {
        Main obj = new Main();
        A.greeting();
    }
}
