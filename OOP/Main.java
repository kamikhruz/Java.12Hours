package OOP;

public class Main {


    public static void main(String[] args) {
         Car myCar = new Car();
         Car myCar2 = new Car(); 

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        myCar.brake();


        // constuctor = a method that is called when an object is instantiated/created
        

        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        human1.eat();
        human2.drink();

        // overloaded constructors = multiple constructors within a class with the same name, but different parameters


        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");

        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);


        System.out.println(pizza.toString()); // explicit
        System.out.println(pizza); // implicit

    }
   
}
