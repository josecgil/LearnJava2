public class c11_For {

    public static boolean isPrime(int number) {
        if (number < 1) return false;
        int testNumber = number;
        while (testNumber > 2) {
            testNumber--;
            int module = number % testNumber;
            if (module == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //for (init;mientras sea cierto;paso)


        //classical way of using "for" keyword
        for (int i = 0; i < intArray.length; i++) {
            int number = intArray[i];
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i<intArray.length/2; i++) {
            int number = intArray[i];
            System.out.print(number);
            System.out.print(" ");
        }
        for (int i = intArray.length-1; i>=intArray.length/2; i--) {
            int number = intArray[i];
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();



        //same as before, less code, less bugs
        for (int number : intArray) {
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();

        String[] teachersArray = new String[]{"Jose", "Carlos", "Eric"};

        //You can iterate over any type of array
        for (String teacher : teachersArray) {
            System.out.print(teacher);
            System.out.print("->");
        }
        System.out.println();


        String[] groups = new String[]{"Abba", "Queen", "LedZep", "Scorpions", "IronMaiden", "DepecheMode", "TheCure", "Placebo", "Metallica", "PinkFloyd"};

        for (int i = 0; i<groups.length/2; i++) {
            String number = groups[i];
            System.out.print(number);
            System.out.print(" ");
        }
        for (int i = groups.length-1; i>=groups.length/2; i--) {
            String number = groups[i];
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();
    }

}
