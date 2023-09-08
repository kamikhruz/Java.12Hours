import java.util.Scanner;

public class Loops {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //While loops in java
        String name = "";
        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        // do....while loop executes the line of code at least once.
            do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());


        // For loops executes a limited amount of times


        for(int i = 0; i <= 10; i++){
            System.out.println();
        }

        // pretty much the same as in JS


        //Nested Loops

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out . println("Enter symbol to use: ");

        for (int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= columns;j++ ){
                System.out.print(symbol);
            }

        }

        }

}
