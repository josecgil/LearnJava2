public class c05_ControlStructures {
    public static void main(String[] args) throws Exception {
        //Conditional execution: IF-ELSE

        System.out.println("Press one key, from 0 to 9");
        int unicodeKey = System.in.read();
        char key=(char)unicodeKey;

        //Without curly braces, only valid for one line sentences.
        //Not recommended
        if (key == '5')
            System.out.println("5!, good key!");

        System.out.println("Press another key, from 0 to 9");
        unicodeKey = System.in.read();
        key=(char)unicodeKey;
        if (key > '5')
            System.out.println("Key is greater than 5");
        else
            System.out.println("Key is less than or equal to 5");


        //Same instructions but with curly braces
        //recommended
        System.out.println("Press another key, from 0 to 9");
        unicodeKey = System.in.read();
        key=(char)unicodeKey;
        if (key == '5')
        {
            System.out.println("5!, good key!");
        }

        System.out.println("Press another key, from 0 to 9");
        unicodeKey = System.in.read();
        key=(char)unicodeKey;
        if (key > '5') {
            System.out.println("Key is greater than 5");
        }
        else {
            System.out.println("Key is less than or equal to 5");
        }

        //multiples else with "else if"
        boolean hasError=false;
        System.out.println("Press another key, from 0 to 9");
        unicodeKey = System.in.read();
        key=(char)unicodeKey;
        if (key <= '5')
        {
            System.out.println("Key is less than or equal to 5");
        }
        else if ( (key=='6') && (!hasError) ) //you can check any condition in the if
        {
            System.out.println("key is 6");
        }
        else if (key=='7')
        {
            System.out.println("key is 7");
        }
        else
        {
            System.out.println("key is greater than 7");
        }

        //With curly braces you can introduce more than one line of code
        //in any if/else code block
        System.out.println("Press another key, from 0 to 9");
        unicodeKey = System.in.read();
        key=(char)unicodeKey;
        if (key > '5')
        {
            System.out.println("key is greater than 5");
            System.out.println("Lucky one!");
        }
        else
        {
            System.out.println("key is less than or equal to 5");
            System.out.println("Keep trying!");
        }


        //Conditional operators

        //Similar to an if but you can only evaluate an expression and return one value
        String password = "patata555";
        boolean passwordIsLong=password.length()>8?true:false;

        hasError = true;
        String message = hasError ? "There is an error" : "No errors";
        System.out.println(message);


        //SWITCH

        //Similar to an if with multiples else if
        //but the expression is only evaluated at the beginning.

        System.out.println("Press another key, from 0 to 9");
        unicodeKey = System.in.read();
        key=(char)unicodeKey;
        switch (key)
        {
            case '1':
                System.out.println("First number");
                break;
            case '2':
                System.out.println("Second number");
                break;
            case '3':
                System.out.println("Third number");
                break;
            case '4':
                System.out.println("Fourth number");
                break;
            default:
                System.out.println("Number <1 or >4");
                break;
        }

        //WHILE

        System.out.println("Press any key to know his Unicode value or 0 to end");
        unicodeKey = System.in.read();
        key=(char)unicodeKey;
        while (key != '0')
        {
            System.out.println("El valor unicode de '" + key + "' es " + unicodeKey);
            unicodeKey = System.in.read();
            key=(char)unicodeKey;
        }


        //DO WHILE

        System.out.println("Press any key to know his Unicode value or 0 to end");
        do
        {
            unicodeKey = System.in.read();
            key=(char)unicodeKey;
            System.out.println("Unicode value is '" + key + "' es " + unicodeKey);

        } while (key != '0');



        //FOR

        //It has 3 parts:
        //An space to init a variable
        //An space to check a condition
        //An space to evaluate an expression
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Line number" + i);
        }

        //every one of its parts are optional
        int x = 10;
        for (; x > 0; x--)
        {
            System.out.println("Number" + x);
        }

        //infinite loop
        //for (; ; )
        //{
        //    System.out.println("A line");
        //}


        // BREAK & CONTINUE

        //The break statement allows you to terminate the nearest envelope loop or switch statement
        //Control is transferred to the statement following the terminated statement, if any.


        for (int i = 1; i <= 100; i++)
        {
            if (i == 5)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("The loop ended by the break statement, this is the next instruction");

        //the continue statement transfers control to the next iteration of the wrapper instruction in which appears        string frase = "Esta es una frase con varias palabras";

        //Count the lowercase vowels of a sentence
        int lowerCaseVowels=0;
        String sentence = "This is a sentence with many words";
        for (int i=0;i<sentence.length();i++) {
            char character=sentence.charAt(i);
            if (Character.isUpperCase(character))
            {
                continue;
            }
            if  ( (character=='a') || (character=='e') || (character=='i') || (character=='o') || (character=='u') )  {
                lowerCaseVowels++;
            }
        }
        System.out.println("The sentence '"+sentence+"' ");
        System.out.println("has "+lowerCaseVowels+" lowercase vowels");
    }

}
