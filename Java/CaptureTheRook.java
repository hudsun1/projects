// Write a function that returns true if two rooks can attack each other, and false otherwise.

public class CaptureTheRook{
    public static void main(String[] args) {

        String[] toast = {"A1","A2"};
System.out.println(canCapture(toast));

    }

	public static boolean canCapture(String[] rooks) {
      
        String word1First = String.valueOf(rooks[0].charAt(0));
        String word1Second =  String.valueOf(rooks[0].charAt(1));
        String word2First =  String.valueOf(rooks[1].charAt(0));
        String word2Second =  String.valueOf(rooks[1].charAt(1));

        
        return word1First.contains(word2First) || word1Second.contains(word2Second) ? true : false;      
}
}

