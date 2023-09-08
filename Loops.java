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

        String[][] kars = new String[3][3]; // the first bracket is for rows/no of arrays and the second bracket is for columns/no of elements.

kars[0][0] = "Camaro";
kars[0][1] = "Corvette";
kars[0][2] = "Silverado";
kars[1][0] = "Mustang";
kars[1][1] = "Ranger";
kars[1][2] = "F-150";
kars[2][0] = "Ferrari";
kars[2][1] = "Lambo";
kars[2][2] = "Telsa";

for(int i = 0; i < kars.length; i++){
    System.out.println();
    for(int j=0; j<kars[i].length; j++){
        System.out.print(kars[i][j] + " ");
    }
}


        }

}
