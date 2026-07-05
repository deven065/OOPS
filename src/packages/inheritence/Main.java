package packages.inheritence;

public class Main {
    static void main() {
        Box box1 = new Box(4.6, 7.9, 9.9);
        Box box2 = new Box(box1);
//
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);

//        Box box5 = new  BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);

        //  there are many variables in both parent and child classes
        //  you are given access to variables that are in the ref type i.e. BoxWeight
        //  hence you should have access to weight variable
        //  this alo means, that the ones you are trying to access should be initialized
        //  but here, when the obj itself is of type parent class, how will you call the constructor of child class

//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

//        BoxPrice box = new BoxPrice(5, 8, 200);

//        Box.greeting();
        BoxWeight box = new BoxWeight();
        box.greeting(); //  you can inherit but you cannot override
    }
}
