 
class GroupA
{
   public static void main (String[] args)
  {
     
    
     System.out.println("Please enter the first sentence of your favourite song");
     
     String sentence = In.getString();
    
    countLetters(sentence); // Function 1: Counting the letters
     
     } 
   
 // Method: Count Letters - Kareena Uppal
 public static String countLetters(String sentence)
 {
 String sentenceLen = sentence.replaceAll("\\W+","");
     System.out.println(sentenceLen.length());
     
     return sentenceLen;
 }
 
} 
