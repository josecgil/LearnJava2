
public class c03_Conversions_Operators {

	public static void main(String[] args) {
        //CONVERSIONS

        //implicit conversions
        int anInt = 3;
        long aLong = anInt;

        float aFloat = 1.15f;
        double aDouble = aFloat; //1.15f the float becomes double 1.15d

        anInt = 3;
        aFloat = anInt; //the integer 3 becomes the float 3.0f
        
        //explicit conversion (casting )
        short aShort = (short)anInt;
        byte aByte = (byte)anInt;


        //conversion with information loss
        float anotherFloat = 4.5f;
        int anotherInt = (int) anotherFloat; //4.5f converts to 4, has lost all decimals


        //Conversion with parsing
        String aNumberWithoutDecimalsInAString = "45";
        int intParsedFromStr=Integer.parseInt(aNumberWithoutDecimalsInAString);
        long longParsedFromStr = Long.parseLong(aNumberWithoutDecimalsInAString);

        String aNumberWithDecimalsInAString = "45.0";
        float floatParsedFromStr=Float.parseFloat(aNumberWithDecimalsInAString);
        double doubleParsedFromStr=Double.parseDouble(aNumberWithDecimalsInAString);

        
        //conversion from char to int
        char c = 'd';
        int charValue = c; //charValue is 100 now, is the unicode value of 'd'

        //conversion from char to String
        char aChar = 'c';
        String aStringFromChar = Character.toString(aChar);

        int aNumber = 5;
        String unaCadenaAPartirDeInt = Integer.toString(aNumber);


        //Extract a char from a String
        String aString="ABCDEF";
        char aCharFromAString = aString.charAt(1); //char will contain 'B'
	}

}
