public class c08_Strings {

    public static void main(String[] args) {
        System.out.println(numberOfAs("BBBBBBB")); //0
        System.out.println(numberOfAs("BBABBBB")); //1
        System.out.println(numberOfAs("BBABBBA")); //2
        System.out.println(numberOfAs("AAABBBB")); //3
        System.exit(0);


        //String

        //Get single chars
        String word = "car";

        char firstLetter = word.charAt(0); //firstLetter='c'
        firstLetter = 'p'; //if i change firstLetter variable it does'nt change the first char of word String

        //String manipulation

        //String.substring(index,[length]);
        //Gets some letters from the string
        String letters = "ABCDEF";
        String someLetters = letters.substring(1); //someLetters="BCDEF"
        String someLetters2 = letters.substring(1, 2); //someLetters2="BC"

        //String.trim();
        //Remove spaces before and after
        String phrase = "  some phrase  ";
        phrase = phrase.trim(); //phrase="some phrase"

        //String.toUpperCase() y .toLowerCase()
        //converts characters to uppercase or lowercase
        String phraseUpper = phrase.toUpperCase();
        String phraseLower = phrase.toLowerCase();

        //String.IndexOf(char|String,[startIndex])
        //Get the first occurrence (position) of a character or string in another
        //returns -1 if the string or character is not found
        String abc = "ABCABC";
        int positionOfTheFirstA = abc.indexOf('A'); //positionOfTheFirstA=0
        int positionOfTheSecondA = abc.indexOf('A', 2); //positionOfTheSecondA=3
        int positionOfZ = abc.indexOf('Z'); //positionOfZ=-1

        //String.LastIndexOf()
        //similar to IndexOf(), but gets the last position
        int positionOfLastB = abc.lastIndexOf('B'); //positionOfLastB=4

        //String.Length gets the length of the string
        String anString = "12345";
        int strLen = anString.length(); //strLen=5

        //String.Replace(char|String,newChar|newString)
        //replace all occurrences of a string or character to another

        String aWord = "bank";
        String anotherWord = aWord.replace("ba", "pla"); //anotherWord="plank"

        String aPhrase = "A duck. I shoot. One duck less.";
        String anotherPhrase = aPhrase.replace("duck", "cat"); //anotherPhrase="A cat. I shoot. One cat less."


        //String.StartsWith(char|String)
        //String.EndsWith(char|String)
        //Determines whether the beginning or end of a string is like the parameter
        String numbers = "12345";
        boolean startsWith2 = numbers.startsWith("2"); //startsWith2=false
        boolean endsIn45 = numbers.endsWith("45"); //endsIn45=true

    }

    private static int numberOfAs(String str){
        int countAs=0;
        str=str.toLowerCase();
        int position=0;
        while (true) {
            int indexOfA = str.indexOf('a', position);
            if (indexOfA ==-1) break;
            countAs++;
            position=indexOfA+1;
        }
        return countAs;
    }

}
