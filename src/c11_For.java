public class c11_For {


    public static void main(String[] args) {
        int[] intArray = new int[]{10, 20, 30};

        //classical way of using "for" keyword
        for (int i = 0; i < intArray.length; i++) {
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

    }

}
