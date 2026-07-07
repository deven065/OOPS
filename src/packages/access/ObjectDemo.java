package packages.access;

public class ObjectDemo {

    int num;
    float gpa;

    ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //  we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //  toString() basically gives the String representation
    @Override
    public String toString() {
        return super.toString();
    }

    //  finalize() gets called when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    static void main() {
        ObjectDemo obj = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);

        if (obj == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        if (obj.equals(obj2)) {
            System.out.println("obj1 is equals to obj2");
        }

        System.out.println(obj.getClass().getName());


//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

    }
}
