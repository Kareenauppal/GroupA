class Grouptesting 
{ 
   public static void main (String[] args) 
  { 
     
     
     System.out.println("Please enter the first sentence of your favourite song"); 
      
     String sentence = In.getString(); 
     
    countLetters(sentence);  
    countWords (sentence); 
    reverseStatement (sentence); 
    reverseLetters (sentence); 
    alternateCase (sentence);
    lettersOnly (sentence);
    reverseWords (sentence);
    countConsonants (sentence);
    uppercase (sentence);
    letterFrequency(sentence);
    search (sentence);
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
   public static void reverseLetters(String sentence) 
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
    System.out.println("");
    System.out.print("Letters Only: ");
    System.out.print(letters);
  }  
  
  // Method - Ben
  public static void uppercase (String sentence)
  {
    
    String firstLetter;
    String otherLetter; 
    
    sentence.trim();
    String word[] = sentence.split("\\s+");
    
    for (int i=0; i<word.length; i++) 
    {
      firstLetter=word[i].substring(0,1);
      
      otherLetter=word[i].substring(1,word[i].length());
      System.out.print("Upper Case : ");
      System.out.println(firstLetter.toUpperCase()+otherLetter+" ");
    }
    
  }
  
   // Method - Ben
    public static void reverseWords(String sentence)
  {  
      sentence.trim();
   String word[] = sentence.split("\\s+");
   
    System.out.println("");
    System.out.print("Reverse Word : ");
     for (int i = word.length-1; i >=0; i--) 
     {
    System.out.println(word[i]+" ");
     }
    
  }
   // Method - Ben
     public static void countConsonants (String sentence) 
    {
      int consonants=0, vowels=0, spaces=0;
      
      
       
      for (int i = 0; i< sentence.length(); i++)
      {
        char word = sentence.charAt(i);
        
        switch(word){
          case 'a':
          case 'A':
          case 'e':
          case 'E':
          case 'i':
          case 'I':  
          case 'o':
          case 'O':
          case 'u':
          case 'U':
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
      System.out.println("consonants amount:"+consonants);
      System.out.println("vowels amount: "+vowels);
      System.out.println("spaces amount: "+spaces);
     }
     
  // Method : Swap
    public static void letterFrequency (String sentence)
    {
     
      int a =0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, ii=0, j=0, k=0, l=0, m=0, n=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0, zz=0;
      
      System.out.print("Letter Frequency" );
      System.out.println("");
      for (int i = 0; i< sentence.length(); i++)
      {
        char word = sentence.charAt(i);
         switch(word)
         {
           case'a':
           case'A':
           a++;
           break;
           
           case'b' :
           case'B' :
           b++;
           break;
           
           case'c' :
           case'C' : 
           c++;
           break;
           
           case'd' :
           case'D' :
           d++;
           break;
           
           case'e' :
           case'E' :
           e++;
           break;
           
           case'f' :
           case'F' :
           f++;
           break;
           
           case'g' :
           case'G' : 
           g++;
           break;
           
           case'h' :
           case'H' :
           h++;
           break;
           
           case'i' :
           case'I' :
           ii++;
           break;
           
           case'j' :
           case'J' :
           ii++;
           break;
           
           case'k' :
           case'K' :
           ii++;
           break;
           
           case'l' :
           case'L' :
           l++;
           break;
           
           case'm' :
           case'M' :  
           m++;
           break;
           
           case'n' :
           case'N' :  
           n++;
           break;
           
           case'o' :
           case'O' :
           o++;
           break;
           
           case'p' :
           case'P' :
           p++;
           break;
           
           case'q' :
           case'Q' :
           r++;
           break;
           
           case'r' :
           case'R' :
           r++;
           break;
           
           case's' :
           case'S' :
           s++;
           break;
           
           case't' :
           case'T' :
           t++;
           break;
           
           case'u' :
           case'U' :
           u++;
           break;
           
           case'v' :
           case'V' :
           v++;
           break;
           
           case'w' :
           case'W' :
           w++;
           break;
           
           case'x' :
           case'X' :
           x++;
           break;
           
           case'y' :
           case'Y' :
           y++;
           break;
           
           case'z' :
           case'Z' :
           z++;
           break;
           
           case  ' ':
           default :
           zz++;
           break;
           
            
            
          
         
         }
      }
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println("E = " + e);
        System.out.println("F = " + f);
        System.out.println("G = " + g);
        System.out.println("H = " + h);
        System.out.println("I = " + ii);
        System.out.println("J = " + j);                   
        System.out.println("k = " + k);                   
        System.out.println("L = " + l);
        System.out.println("M = " + m);                   
        System.out.println("N = " + n);
        System.out.println("O = " + o);
        System.out.println("P = " + p);
        System.out.println("Q = " + q);   
        System.out.println("R = " + r);                   
        System.out.println("S = " + s);                   
        System.out.println("T = " + t); 
        System.out.println("U = " + u); 
        System.out.println("V = " + v);
        System.out.println("W = " + w);
        System.out.println("X = " + x); 
        System.out.println("Y = " + y); 
        System.out.println("Z = " + z);
        System.out.println("Others and spaces = " + zz);
        
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
}
