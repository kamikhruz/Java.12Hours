import java.util.Scanner;

public class main {

    public static void main(String[] args){
    /* 
        System.out.print("I love Pizza\n");
        System.out.println("It's really good!");

        int z = 123;
        System.out.println("My number is : " + z);

        String x = "water";
        String y = "Kool-Aid";

        String temp;

        temp =  x;
        x = y;
        y = temp;

        System.out.println(x + " " + y);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("What's your favourite food?");
        String food = scanner.next();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old"); 
        System.out.println("You like "+food);

        
    }
}