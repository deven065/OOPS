package packages.polymorphism;

public class Numbers {
    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void main() {
        Numbers obj = new Numbers();
        obj.sum(1, 3);
        obj.sum(1, 3, 7);
    }
}
