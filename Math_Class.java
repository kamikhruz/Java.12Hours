import java.util.Scanner;

public class Math_Class {
    
    public static void main(String[] args){

        /* 
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);

        Math.round(3.3333);

        double */


        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);

        scanner.close();

    }
}
