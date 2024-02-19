public class Example_Method_Overload_Pad {

    private static String createPad(int len, char c) {
        if (len<0) throw new StringIndexOutOfBoundsException("Can't pad a string with a negative amount of characters ("+len+")");
        return new String(new char[len]).replace('\0', c);
    }

    public static String rightPad(String str, int len) {
        return rightPad(str, len, ' ');
    }
    public static String rightPad(String str, int len, char c) {
        return str + createPad(len, c);
    }
    public static String leftPad(String str, int len) {
        return leftPad(str, len, ' ');
    }
    public static String leftPad(String str, int len, char c) {
        return createPad(len, c) + str;
    }

    public static void main(String[] args) {

        System.out.println("'" + leftPad("12345", 5, '-') + "'");
        System.out.println("'" + rightPad("12345", 5) + "'");

    }
}