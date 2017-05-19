     String sentence = In.getString();
    
    countLetters(sentence); // Function 1: Counting the letters
    countWords (sentence);
    reverseStatement (sentence);
    reverseWords (sentence);
    alternateCase (sentence);
      
     } 
   
 // Method: Count Letters - Kareena Uppal
 public static String countLetters(String sentence)
 {
     String sentenceLen = sentence.replaceAll("\\W+","");
     System.out.print("Letter Count  : ");
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
     System.out.println(sentence);
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
   
    char [] chr= str.toCharArray();
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

}
  
    
