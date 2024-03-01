public class c07_Functions {

    //This is a function that doesn't return any value (void)
    //and has no parameters
    private static void aFunction() {
        //do something
        System.out.println("You have call a function without params");
    }

    //This function receives 2 params, an int and a string
    private static void aFunctionWithParams(int anInt, String aString) {
        anInt = 14;


        //Do something with the int and a String
        System.out.println("You have call a function with 2 params");
        System.out.println("anInt:" + anInt);
        System.out.println("aString:" + aString);
    }

    //This function doesn't receive params, but returns a value
    private static String aFunctionWithReturnValue() {
        return "hello"; //the return keyword returns a value AND ends the function execution
    }

    //This function receives a param and returns a value
    private static int aFunctionWithReturnValueAndAParam(int number) {
        int result = number * 2;
        return result;
    }

    //This function ends before the end of the function if the number is Even
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }


    //A better (more real) example
    private static boolean startsWithVowel(String word) {
        boolean firstIsVowel = false;
        char firstChar = word.charAt(0);
        if (firstChar == 'a') firstIsVowel = true;
        if (firstChar == 'e') firstIsVowel = true;
        if (firstChar == 'i') firstIsVowel = true;
        if (firstChar == 'o') firstIsVowel = true;
        if (firstChar == 'u') firstIsVowel = true;

        if (firstChar == 'A') firstIsVowel = true;
        if (firstChar == 'E') firstIsVowel = true;
        if (firstChar == 'I') firstIsVowel = true;
        if (firstChar == 'O') firstIsVowel = true;
        if (firstChar == 'U') firstIsVowel = true;

        return firstIsVowel;
    }

    //The same function, but shorter
    private static boolean startsWithVowel2(String word) {
        char firstChar = word.toLowerCase().charAt(0);
        if (firstChar == 'a') return true;
        if (firstChar == 'e') return true;
        if (firstChar == 'i') return true;
        if (firstChar == 'o') return true;
        return firstChar == 'u';
    }


    public static void main(String[] args) throws Exception {

        aFunctionWithParams(1, "patata");

        boolean twoIsEven = isEven(2);

        int num = 1; //zona 1 RAM
        String str = "patata"; //zona 2 RAM


        aFunctionWithParams(num, str);
        System.out.println("NUM:" + num);
        System.exit(0);


        //Call to functions
        boolean alcoholStartsWithVowel = startsWithVowel("alcohol"); //true
        boolean bottleStartsWithVowel = startsWithVowel("bottle"); //false

        //Calc if a number (introduced by the keyboard) is ODD or EVEN
        System.out.println("Introduce a number and press ENTER");
        char number = (char) System.in.read();
        int numberAsInt = Integer.parseInt(String.valueOf(number));
        boolean numberIsEven = isEven(numberAsInt);
        System.out.print(number);
        if (numberIsEven) {
            System.out.println(" is even");
        } else {
            System.out.println(" is odd");
        }
    }

}
