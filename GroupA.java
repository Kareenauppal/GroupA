class GroupA
{
   public static void main (String[] args)
  {
    
    
     System.out.println("Please enter the first sentence of your favourite song");
     
     String sentence = In.getString();
    
    countLetters(sentence); // Function 1: Counting the letters
    countWords (sentence);
    reverseStatement (sentence);
     } 
   
 // Method: Count Letters - Kareena Uppal
 public static String countLetters(String sentence)
 {
 String sentenceLen = sentence.replaceAll("\\W+","");
     System.out.println(sentenceLen.length());
     
     return sentenceLen;
 }
 
 // Method: Count Words - Kenny
 public static void countWords(String sentence)
 {  
    String [] words = sentence.split("\\s+");
    System.out.print("Word Count : ");
    System.out.println(words.length);
  }
 
   // Method: Reverse Statement- Kenny
  public static void reverseStatement(String sentence)
  {     
        String reverso = sentence;
        StringBuffer reverseBuff = new StringBuffer(reverso);
        String stringRev = reverseBuff.reverse().toString();
        System.out.println(stringRev);      
  }
}
