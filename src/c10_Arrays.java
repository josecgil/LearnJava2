public class c10_Arrays {

    public static void main(String[] args) {
        //ARRAYS
        //An array (sometimes called matrix) is a data structure that contains
        //many variables of the same type
        //An array can have multiple dimensions
        //but it's size is fixed at creation time

        //Unidimensional array
        //We declare an array with 3 spaces to place int values
        int[] unidimensionalArray = new int[3];
        unidimensionalArray[0] = 10;
        unidimensionalArray[1] = 20;
        unidimensionalArray[2] = 30;

        //Same array, but declared & initialized in the same line
        //there are times where you can't declare & init the array
        //in the same place because you don't know in advance
        //the values needed to store.
        int[] unidimensionalArray2 = new int[]{10, 20, 30};

        //alternative syntax, same as before
        int[] unidimensionalArray3 = {10, 20, 30};


        //Multidimensional Array
        String[][] multidimensionalArray = new String[2][3]; //2 dimensions array
        multidimensionalArray[0][0] = "A";
        multidimensionalArray[0][1] = "B";
        multidimensionalArray[0][2] = "C";
        multidimensionalArray[1][0] = "D";
        multidimensionalArray[1][1] = "E";
        multidimensionalArray[1][2] = "F";

        // Declare & init a multidimensional array
        String[][] multidimensionalArray2 = {{"A", "B", "C"}, {"D", "E", "F"}};

        String[][] personasCine = {
                {"Giulia", "MJ"  , "Alex"},
                {"JC"    , "Emma", "Elsa"}
        };



        double[] bitcoins={0.123,0.42345,0.123123,1.9992,0.12,0.12456};
        System.out.println("Euros que gestionamos: "+totalInEuros(bitcoins)+"€");
    }

    private static double totalInEuros(double[] bitcoins) {
        double totalBitcoins=0;
        for (int i=0;i<bitcoins.length;i++) {
            double currentBitcoin=bitcoins[i];
            totalBitcoins=totalBitcoins+currentBitcoin;
        }
        return totalBitcoins*61684.61; //179707.81€

    }


}
