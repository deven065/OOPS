package enumExamples;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //  these are called enum constants
        //  public, static and final
        //  since it's final you can't create child enums
        //  type is Week

        @Override
        public void hello() {
            System.out.println("Hey how are you?");
        }
    }

    void Week() {
        System.out.println("Constructor called for " + this);
    }
    //  this is not public or protected, only private or default
    //  why? we don't want to create new objects
    //  because this is not the enum concept, that's why

    //  internally: public static final Week Monday = new Week();


    static void main() {
        Week week;
        week = Week.Monday;
        week.hello();

        for (Week day: Week.values()) {
            System.out.println(day);
        }
    }
}
