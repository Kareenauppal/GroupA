class GroupA
{
   public static void main (String[] args)
  {
     
    
     System.out.println("Please enter the first sentence of your favourite song");
     
     String sentence = In.getString();
    
    countLetters(sentence); // Function 1: Counting the letters
    countWords (sentence);
     } 
   
 // Method: Count Letters - Kareena Uppal
 public static void countLetters(String sentence)
 {
 String sentenceLen = sentence.replaceAll("\\W+","");
     System.out.println(sentenceLen.length());
     
   
 }
 
 // Method: Count Words - Kenny
 public static void countWords(String sentence)
 {

    
    String [] words = sentence.split("\\s+");
    
    System.out.print("Word Count : ");
    System.out.println(words.length);
    

  } 
}
