class EscapeSequence {
     public static void main(String[] args) {
   System.out.println("Hi\fHello"); 
   System.out.println("HiHello\f");
   System.out.println("\fHiHello");
   System.out.println("HRU?");
   System.out.println();
   System.out.println("Hi\bHello"); 
   System.out.println();
   System.out.println("Hi\nHello"); 
   System.out.println();
   System.out.println("Hi\tHello"); 
   System.out.println();
   System.out.println("Hi\rHello"); 
   System.out.println("HiHello\rHRU?"); 
   System.out.println("HiHelloHRU?\r");
   System.out.println("\rHiHelloHRU?");
   System.out.println();
 //          System.out.println("""); //DQ in DQ is not allowed
 //          System.out.println(''');   //SQ in SQ is not allowed
   System.out.println("\"");   
   System.out.println('\'');  
   System.out.println('"');   //In SQ DQ is allowed
   System.out.println("'");   //In DQ SQ is allowed
 //          System.out.println("\"); //HERE \ IS CONSIDERED AS ESCAPER
 //          System.out.println('\'); //HERE \ IS CONSIDERED AS ESCAPER
   System.out.println("\\"); //We must use \\ to consider \ as a \
 //          System.out.println("\\\"); 
   System.out.println("\\\\"); 
     }
 }
