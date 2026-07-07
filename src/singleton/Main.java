package singleton;

import packages.access.A;

public class Main {
    static void main() {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        //  all 3 ref variables are pointing to just one object

        A a = new A(10, "Kunal");
        a.getNum();
    }
}
