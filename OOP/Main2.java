package OOP;

public class Main2 {
    

    public static void main(String[] args) {
        
        Food [] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("hotdog");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

        // static = modifier, A single copy of a variable/method is created and shared.
        // The class "owns" the static member

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Sandy");
        Friend friend3 = new Friend("Patrick");

         Friend.displayFriends();


        // inheritance = the process where one class acquires, the attributes and methods of another

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(bike.speed);

        // method overriding = Declaring a method in sub class,
        // which is already present in parent class.
        // done so that a child class can give its own implementation 

        //super = keyword refers to the superclass (parent ) of an object
        // very similar to the 'this' keyword

        Hero hero1 = new Hero("Batman", 43,"$$$");
        Hero hero2 = new Hero("Superman", 44,"everything");

        System.out.println(hero2.toString());
    }
}
