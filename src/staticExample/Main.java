package staticExample;

public class Main {
    static void main() {
        Human kunal = new Human(22, "Kunal Kushwaha", 10000, false);
        Human rahul = new Human(24, "Rahul", 15000, true);
        Human deven = new Human(25, "Deven Rikame", 100000, false);

        System.out.println(Human.population);
        System.out.println(kunal.name);
        System.out.println(rahul.age);
    }
}
