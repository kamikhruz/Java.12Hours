import java.util.ArrayList;

public class for_each_loops {
    
    public static void main(String[] args) {
        // for-each = traversing technique to iterate through the elements in an array/collection
        // its less flexible but
        // has less steps and is more readable

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i: animals){
            System.out.println(i);
        }

   

} 
}
