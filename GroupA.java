class GroupA 
{ 
   public static void main (String[] args) 
  { 
     
     
     System.out.println("Please enter the first sentence of your favourite song"); 
      
     String sentence = In.getString(); 
     
    countLetters(sentence); //  Counting the letters 
    countWords (sentence); // Counting the words
    reverseStatement (sentence); 
    reverseWords (sentence); 
    alternateCase (sentence);
    lettersOnly (sentence);
    search (sentence);
      reverseW (sentence);
       countConsonants (sentence);
     }  
    
 // Method: Count Letters - Kareena Uppal 
 public static void countLetters(String sentence) 
 { 
     String sentenceLen = sentence.replaceAll("\\W+",""); 
     System.out.print("Letter Count  : "); 
     System.out.println(sentenceLen.length()); 
  
 } 
  
 // Method: Count Words - Kenny 
 public static void countWords(String sentence) 
 {   
    String [] words = sentence.split("\\s+"); 
    System.out.print("Word Count : "); 
    System.out.println(words.length); 
  } 
  
 // Method:  Reverse Statement - Kenny 
  public static void reverseStatement(String sentence) 
  {      
        String reverso = sentence; 
        StringBuffer reverseBuff = new StringBuffer(reverso); 
        String stringRev = reverseBuff.reverse().toString(); 
        System.out.print("Reverse Statement  : "); 
        System.out.println(stringRev);  
        
  } 
        
 
// Method: Reverse Words - Kenny 
   public static void reverseWords(String sentence) 
  { 
     
     String[] words = sentence.split("\\s+"); 
      
     String reverseSentence = ""; 
     System.out.print("Reverse Words  : "); 
     
     for (String word : words) 
  { 
    String reverseWord = ""; 
     
    for (int i = word.length()-1; i >= 0; i--) 
    reverseWord += word.charAt(i); 
    reverseSentence += reverseWord; 
    reverseSentence += " "; 
     
    System.out.print(reverseWord + " "); 
  } 
    reverseSentence.trim(); 
     
  } 
    
    
   // Method: Alternate Case - Kareena Uppal 
  public static void alternateCase(String sentence) 
{ 
   
    //System.out.print("Please enter the first sentence of your favourite song"); 
    String str = sentence; 
      
    char [] chr = str.toCharArray(); 
    int n = chr.length; 
    char ch; 
    int i; 
    System.out.println(" ");  
    System.out.print("Alternate Case : ");  
    for(i = 0; i < n; i++) { 
       
      if(i % 2 == 0) { 
        ch = Character.toLowerCase(chr[i]); 
        chr[i]=ch; 
      } else { 
        ch = Character.toUpperCase(chr[i]); 
        chr[i]=ch; 
      } 
    } 
     for(i = 0; i < n; i++) 
     { 
    System.out.print(chr[i]); 
     } 
  } 
  
  //Method: Letters Only - Kareena Uppal
  public static void lettersOnly(String sentence)
  {
    
    String letters = sentence.replaceAll("\\W+",""); 
    System.out.println(" ");
    System.out.println("Letters Only: " +letters);
  }
  
  //Method: Search - Kareena Uppal
  public static void search (String sentence)
  {
   
    System.out.println("What string do you want to find?");
    String word = In.getString();
    int location;
    location = sentence.indexOf(word); 
    System.out.println(" ");
    System.out.println(word +" is found at character #" +location +" in the sentence " +sentence);

  }
   // Method - Ben
    public static void reverseW(String sentence)
  {
     
//  String input;
 // sentence.equals("input");
     //input = In.getString();
     
      sentence.trim();
   String word[] = sentence.split("\\s+");
   
     for (int i = word.length-1; i >=0; i--) 
     {
    System.out.print(word[i]+" ");
     }
    
  }
 
     public static void countConsonants (String sentence) 
    {
      int consonants=0, vowels=0, spaces=0;
      
      
       
for (int i = 0; i< sentence.length(); i++)
{
  char word = sentence.charAt(i);

  switch(word){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
vowels++;
break;
case  ' ':
    spaces++;
break;
    default:
consonants++;
break;
  }
  
}
System.out.println("consonants amout:"+consonants);
System.out.println("vowels amout: "+vowels);
System.out.println("spaces amount: "+spaces);
    }
      
}
    
    
    
    
    
    
    
    
    
    
    
    

  
