
public class c02_Variables_Types {


	public static void main(String[] args) {
        //Comments

        //2 types: single line & multiline

        //Single line
        System.out.println(); //this is a single line comment


        /* Multiline comment
         * You can write more 
         * than one line
         */

        /* Also 
           possible
           like this */

        /* It can be in one line too */

        System.out.println(); /* before code comment */


        //Without decimals NUMBERS
        //Integers: values from -2.147.483.648 to 2.147.483.647
        int anInt; //We declare the variable and do not give value. The default value is 0
        int anotherInt = 3; //We declare the variable and give it a value. This is called "initialize".

        //Smaller than int numbers : short ( -32,768 to 32,767 ) and byte ( -128 to 127 )
        //And greater numbers : long ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 )
        byte aByte = 12;
        short aShort = -20000;
        long aLong = -9223372036854775808L; //Note the last "L"

        // Numbers with decimals
        
        //float and double types can store large amounts with many decimals at the cost of some precision
        //in computation and storage
        
        //float: Approx. ± 1.5 x 10^45 to ± 3.4 × 10^38 with 7 decimal digits
        float aFloat = 3.16f; //note the final "f"
        
        //double: Approx. ±5.0 x 10^324 to ±1.7 x 10^308 with 15 o 16 decimal digits
        double aDouble = 400.123456879; //by default a decimal number is a float


        //BOOLEANS, they can only be true or false

        boolean aBool=false;
        boolean antherBool=true;

        //Initialization
        int anIntVar; //0 by default
        float aFloatVar; //0.0f by default

        int a, b, c; //We have declared three integer variables (a, b, c)

        int d = 3; //d is initialized with 3
        int e, f = 4, g = -56; //declared 3 variables with different values (0, 4 y -56)


        //strings and chars
        char aChar='c';
        String anString = "an string";

        //ESPECIAL CHARS

        //How do we put a character " (double quote) into an string?
        
        //Using the escape character "\"
        //any character that comes after the backslash (\) is understood
        //as a normal character, not a character with special meaning 
        //(such as single or double quotes )
        String anEscString = "This is a string with a double quote at the end: \".";
        //Is the same in a char
        char anEscChar = '\'';

        //How can we put a "\" character in a string
        String filePathUnix="/Documents/alex/file.txt";
        String filePathWindows="C:\\Documents\\alex\\file.txt";
        System.out.println(filePathWindows);


        String stringWithBackslash = "This is a string with a backslash: \\\\\\\\";
        System.out.println(stringWithBackslash);

        // It is also used for special characters that can not be displayed using the keyboard :
        // New line (enter) : \ n
        // Tab (TAB ) : \ t
        // Unicode character : \ uxxxx ( xxxx is the number of Unicode character in hexadecimal)

        //Example copyright symbol is the Unicode character 169 (A9 in hexadecimal)  
        System.out.print("\u00A9 1999-2010 \t Mi empresa \n");

        System.out.println("This is a new line");

        //Concatenate Strings
        String hello = "Hello";
        String world = "World";

        String helloWorld = hello + " " + world;

        char exclamation = '!';
        helloWorld = helloWorld + exclamation;

        System.out.println(helloWorld);

        //Variables vs Contants

        //A variable stores a value that can change throughout the program
        int aVariable = 1;
        aVariable = 4;
        aVariable=aVariable*2;

        //A constant stores a value that is fixed throughout the program
        final double PI=3.1416;
        
        double result =aVariable*PI+100;

        final int MINUTES_IN_AN_HOUR=60;
        final int SECONDS_IN_AN_MINUTE=60;

        int seconds=1*MINUTES_IN_AN_HOUR*SECONDS_IN_AN_MINUTE;

	}

}
