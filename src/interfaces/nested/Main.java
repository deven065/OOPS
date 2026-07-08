package interfaces.nested;

public class Main {
    static void main() {
        B obj = new B();
        obj.isOdd(5);
        System.out.println(obj.isOdd(6));
    }
}
