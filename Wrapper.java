public class Wrapper {
    
    public static void main(String[] args) {
        

        // wrapper class = provides a way to use primitive data types as reference data types
        // reference data types contain useful methods
        // can be used with collections (ex.ArrayList)

        // primitive data types are faster than reference data types

        // autoboxing = the automatic conversion that the java compiler makes between the primitive data types and their corresponding wrapper classes

        Boolean a = true;  // autoboxing

        if (a == true) {                // unboxing: The opposite of autoboxing.
            System.out.println("This is true");
        }

            // autoboxing
            Integer iObj = 10;
            // unboxing]
            int i = iObj; // i = 10

    }
    
}
