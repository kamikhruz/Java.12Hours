public class printf_method {
    
    public static void main(String[] args) {
        // printf() = an optional method to control, format, and display text to the console window
        // two arguments = format string + (object/variable/value)
        // %[flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format string %d", 123); // this is a format specifier, whatever is in the second parameter will be placed in the position of '%d'

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion - character]

        // the format specifier 'b' is to be succeeded by a letter to denote the datatype of the second parameter i.e (object/variable/value)

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%d", myInt);



        // [width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString);// if a negative number is used, the space allocated would then go to the right of the string

        // [precision]
        // digits of precision when printing float numbers  
        System.out.printf("You have this much money %9.2f", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to the format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.println();





    }
}
