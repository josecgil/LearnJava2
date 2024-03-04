import java.util.Scanner;

public class c09_Scanner {

    public static void main(String[] args) {
        //The Scanner class allows to read the input from console
        //Same as System.in.read() but also for other types (String,
        //int, boolean...)

        Scanner scanner = new Scanner(System.in);
        String aString = scanner.nextLine();
        int anInt = scanner.nextInt();
        boolean aBoolean = scanner.nextBoolean();

        //Is recommended to always read the input from the user as String
        //and then use the correct methods to check if it's a correct input
        String input = scanner.nextLine();


        System.out.print("Introduce un número entero:");
        String userInput=scanner.nextLine();

        int number=0;
        try {
            number = Integer.parseInt(userInput);
            System.out.println("El número introducido es: "+number);
        } catch(NumberFormatException ignore) {
            System.out.println("'"+userInput + "' no es un número entero");
        }
    }

}
