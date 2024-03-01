public class c06_VariableScope {
    public static void main(String[] args) throws Exception {
        //SCOPE: CORRECT USE

        //Variables don't have to be declared at the start, can be
        //declared when they are needed
        System.out.println("Print some numbers, Continue? (s/N/?)");
        char key = (char) System.in.read();
        if (key == 's') {
            int number = 1; //we declare the variable inside the if block
            //just before the first use
            while (number <= 10) {
                System.out.println(number + " x 5 = " + number * 5);
                number++;
            }
        }
        //outside the if block the "number" variable does'nt exists
        //the memory space of the "number" variable is freed

        if (key == '?') {
            //we can create another "number" variable en another scope,
            //this is not an error
            int number = 3;
            System.out.println("Help: this program shows some numbers");
        }


        //SCOPE: INCORRECT USES

        //The 'i' variable exists only inside the for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            //int i=4; //incorrect, there is another variable in this scope
        }

    }
}
