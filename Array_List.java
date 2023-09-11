
import java.util.ArrayList;
import java.util.*;


public class Array_List {
    

    public static void main(String[] args) {
        // ArrayList = a resizable array
        // Elements can be added and removed after compilation phase
        // store reference data types


            // create an ArrayList of String type
    ArrayList<String> food = new ArrayList<String>();

    // add some elements
    food.add("rice");
    food.add("beans");
    food.add("yam");

    food.set(0, "sushi"); // set element at set index
    food.remove(2);  // removes element at set index


    for (int i = 0; i < food.size(); i++){
        System.out.println(food.get(i)); // to get an element from the array
    }

    

   
    // get the first element
    String first = food.get(0); // rice

    // remove the last element
    food.remove(food.size() - 1); // yam

    // print the ArrayList
    System.out.println(food); // [rice, beans]

        food.clear();   // clear arraylist

        //2D ArrayList 

    ArrayList<ArrayList<String>> groceryList = new ArrayList();

    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");
    
    ArrayList<String> produceList = new ArrayList<String>();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    produceList.add("peppers");

    ArrayList<String> drinksList = new ArrayList();
    drinksList.add("soda");
    drinksList.add("coffee");
    drinksList.add("coke");

    groceryList.add(0, bakeryList);
    groceryList.add(1, produceList);
    groceryList.add(2, drinksList);

    System.out.println(groceryList);
    System.out.println(groceryList.get(0).get(0));// to get the first element at the first list
    
    }
}
 