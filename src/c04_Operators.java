public class c04_Operators {
    public static void main(String[] args) {
        //Assignment and equality

        int a = 3; // a is 3
        boolean isEqual = a == 3; // isEqual is true

        //Math operators

        int sum = 4 + 2;
        int subtraction= 4 - 2;
        int multiplication = 4 * 2;
        int division = 4 / 2;

        int remainder = 5 % 2; //Also "modulus". Result of integer division of 5/2, the remainder is 1.

        double divisionResultWithDecimals= 5 / 2; //result is 2.5d;

        int aNumber = 1;

        aNumber++; //same as aNumber=aNumber+1;

        aNumber--; //same as aNumber=aNumber-1;

        int quantity=2;

        aNumber += quantity; //same as aNumber=aNumber+quantity;
        aNumber -= quantity; //same as aNumber=aNumber-quantity;
        aNumber *= quantity; //same as aNumber=aNumber*quantity;
        aNumber /= quantity; //same as aNumber=aNumber/quantity;



        //Relational operators

        boolean result;

        result = 1 == 2; //equal
        result = 1 != 2; //different

        result = 1 > 2; //greater than
        result = 1 < 2; //less than

        result = 1 >= 2; //greater or equal than
        result = 1 <= 2; //less or equal than


        //Logical operators

        result = (1 == 1) && (2 > 1); //AND
        result = (1 == 1) || (3 > 4); //OR
        result = !(2 > 1); //NOT

        //Operator precedence

        // ++ y --
        // !
        // *  /  %
        // +  -
        // <  >  <=  >=
        // ==  !=
        // &&
        // ||
        // =  *=  /=  %=  +=  -=

        int calc = 3 + 2 * 2; //Question: the result is 10 or 7?

    }
}
