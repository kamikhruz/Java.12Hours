public class methods {

    public static void main(String[] args) {
             // method = a block of code that is executed whenever it is called upon
             String name = "Bro";
             hello(name);  // name is the argument
     
              int x = 3;
             int y = 4;
     
             int z = add(x,y);// returning the value of add() into the z integer
     
         }
     
         static void hello(String nameParameter){// name parameter is the parameter
             System.out.println("Hello!" +nameParameter); 
     
     
         
     
        
         }
         //Return values
     
         static int add(int x, int y){
             int z = x + y;
             return z;
         }
     
         // the returned  value can be stored in a variable and be used for other purposes
     
         
    //overloaded methods = methods that share the same name but have diffeerent parameters

    //method name + method parameters = method signature

    static int add(int a, int b, int c){
        return a + b;
    }


    
}
