package exceptionHandling;

public class Main {
    static void main() {
        int a = 5;
        int b = 1;
        try {
            divide(a, b);
            // mimicking
            String name = "kunal";
            if (name.equals("kunal")) {
                throw new MyException("name is kunal");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by 0");
        }
        return a / b;
    }
}
