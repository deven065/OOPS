package packages.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubClass obj = new SubClass(45, "Kunal Kushwaha");
        int n = obj.num;
    }
}

class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubSubClass obj = new SubSubClass(45, "Kunal Kushwaha");
        int n = obj.num;
    }
}

class SubClass2 extends A{
    public SubClass2(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubClass2 obj = new SubClass2(45, "Kunal Kushwaha");
        int n = obj.num;

        System.out.println(obj instanceof Object);
    }
}