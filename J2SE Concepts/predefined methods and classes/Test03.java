public class  Test03{
 public static void main(String[] args) {
 String s1 = new String("a");
 String s2 = new String("a");
 System.out.println(s1 == s2); //f
 System.out.println(s1.equals(s2)); //t
 System.out.println();
 Integer i1 = new Integer(5);
 Integer i2 = new Integer(5); 
 System.out.println(i1== i2); //f
 System.out.println(i1.equals(i2)); //t
 System.out.println();
//Case #1: comparing same class objects
 Example e1 = new Example(10, 20);
 Example e2 = new Example(10, 30);
 System.out.println(e1 == e2); //f
 System.out.println(e1.equals(e2)); //t
 System.out.println();
//Case #2: comparing diff class objects
 //System.out.println(e1 == s1);
 System.out.println(e1.equals(s1)); //f
 System.out.println(); 
//Case #3: comparing class object and null/null ref var
 System.out.println(e1== null); //f
 System.out.println(e1.equals(null)); //f
 System.out.println(); 
 System.out.println(null == e1); //f
 //System.out.println(null.equals(e1));
 System.out.println(); 
 Example e3 = null;
 System.out.println(e3 == e1); //f
 //System.out.println(e3.equals(e1));
 System.out.println(); 
//Case #4: comparing two nulls
 System.out.println(null == null); //t
 //System.out.println(null.equals(null));
 System.out.println(); 
 Example e4 = null;
 System.out.println(e3 == e4);  //t
 //System.out.println(e3.equals(e4));
 System.out.println(); 
//Case #5: comparing two primitive values
 int a = 10;
 int b = 10;
 System.out.println(a == b); //t
 //System.out.println(a.equals(b));
 System.out.println(); 
 }
}