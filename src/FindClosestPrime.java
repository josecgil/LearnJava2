import java.util.Scanner;

public class FindClosestPrime {

    static class Triangle {
        public int numberOfSides=3;
    }

    public static void main(String[] args) throws Exception {
        //Dado un número entero buscar el número primo más cercano (por arriba o por abajo)

        Triangle miTriangulo=new Triangle();
        System.out.println(miTriangulo.numberOfSides);
        boolean isTriangle=isTriangle(miTriangulo);
        System.out.println(miTriangulo.numberOfSides);


        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int number=scanner.nextInt();


        System.out.println("El número primo más cercano es  :"+findNearestPrime(number));


    }

    private static boolean isTriangle(Triangle triangle) {
        triangle.numberOfSides=4;
        return false;
    }

    // 10 => 7
    /*
        10 => 9 es primo? -1 isPrime(9) NO
        8 es primo? -1
        7 es primo= SI return 7 -1 SI
     */

    private static int findNearestPrime(int number) {
        int lowerClosest=findLowerClosestPrime(number);
        int upperClosest=findUpperClosestPrime(number);
        if (lowerClosest==-1) {
            return upperClosest;
        }
        if (upperClosest==-1) {
            return lowerClosest;
        }

        int distanceToLower=number-lowerClosest;
        int distanceToUpper=upperClosest-number;
        if (distanceToUpper<distanceToLower) {
            return upperClosest;
        }
        return lowerClosest;
    }

    private static int findLowerClosestPrime(int number) {
        if (number<=1) return -1;
        number--;
        while (!isPrime(number)) {
            number--;
        }
        return number;
    }

    private static int findLowerClosestPrime2(int number) {
        if (number<=1) return -1;
        do {
            number--;
        } while(!isPrime(number));
        return number;
    }

    private static int findLowerClosestPrime3(int number) {
        if (number<=1) return -1;
        while (true) {
            number--;
            boolean numberIsPrime=isPrime(number);
            if (numberIsPrime) break;
        }
        return number;
    }

    private static int findUpperClosestPrime(int number) {
        if (number<1) return -1;
        while (true) {
            number++;
            boolean numberIsPrime=isPrime(number);
            if (numberIsPrime) break;
        }
        return number;
    }



    public static boolean isPrime(int number) {
        if (number<1) return false;
        int testNumber=number;
        while (testNumber>2) {
            testNumber--;
            int module=number % testNumber;
            if (module==0) return false;
        }
        return true;
    }


}
