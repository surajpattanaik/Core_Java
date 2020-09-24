//public String toString()
public class  Test05 {
 public static void main(String[] args) { 
 A a1 = new A(); //1. class name 2. reference 3. state
 B b1 = new B();
 C c1 = new C();
 System.out.println(a1);  //toString() method return value will be displayed
 // that value may be CN@hc or state of the object 
 // it is depending on overriding toSting()
 //by default toString() returns CN@hash code in hexa strig format
 //from java.lang.Object. If we want to return state of this object, 
 //we must override toStirng() method in our classs
 System.out.println(b1);
 System.out.println(c1);
 String s1 = "hari";
 Integer io1 = 7279;
 StringBuffer sb1 = new StringBuffer("NiT");
 StringBuilder sb2 = new StringBuilder("Ameerpet");
 System.out.println(s1);
 System.out.println(io1);
 System.out.println(sb1);
 System.out.println(sb2);
 char[] ch = {'a', 'b', 'c'};
 System.out.println(ch); //=> for loop content is displayed
 System.out.println("ch: "+ ch);  //=> ("ch: "+ch.toString())
 int[] ia = {1,2,3};
 System.out.println(ia);
 String[] sa = {"a", "b", "c"};
 System.out.println(sa);
 A[] aa = {new A(), new A(), new A()};
 System.out.println(aa);
 //System.out.println(null);
 System.out.println((String)null);
 System.out.println((A)null);
 System.out.println((int[])null);
 //System.out.println((char[])null);
 System.out.println("hi: "+(char[])null);
 }
}
class A{ int x = 10; @Override public String toString(){ return ""+x; }};
class B{ int y = 20;};
class C{ 
 int z = 30;
 @Override 
 public int hashCode(){
 System.out.println("hC() is executed");
 return 10;
 }
};