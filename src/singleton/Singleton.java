package singleton;

//  It is just a class which you can create 1 object of

public class Singleton {
    private Singleton() {

    };

    private static Singleton instance;

    public static Singleton getInstance() {
        //  check whether only 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
