import java.util.Random;

import java.util.Scanner;

public class random {


    public static void main(String[] args){

        Random random = new Random();
        int x = random.nextInt();
        double y = random.nextDouble(0.5,0.6);

        System.out.println(y);


        // Switch Cases

        String day = "Friday";

        switch(day) {
            case "Sunday": System.out.println("it is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("it is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thurday!");
            break;
            case "Friday": System.out.println("it is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("That is not a day");

            // Logical operators = used to connect two or more expressions

            Scanner scanner = new Scanner(System.in);

            System.out.println("You are playing a game! press q or Q to quit");

            String response = scanner.next();

            if (response.equals("q") || response.equals("Q")){
                System.out.println("You quit the game.");
            }
        }

    }
    
}
