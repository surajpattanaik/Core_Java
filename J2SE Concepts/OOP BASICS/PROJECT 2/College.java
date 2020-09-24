public class College {
 public static void main(String[] args) {
 Person p1 = new Person("HK", 5.6, 70);
 Student  s1 = new Student("HK", 5.6, 70, 101, "CJ", 2500);
 Faculty f1 = new Faculty("HK", 5.6, 70, 7279, "CJ", 25000);
 System.out.println(p1); //p1.toString()
 System.out.println(); 
 System.out.println(s1); //s1.toString()
 System.out.println(); 
 System.out.println(f1); //s1.toString()
 System.out.println();
 p1.eat();
 s1.eat();
 f1.eat();
 System.out.println();
 p1.sleep();
 s1.sleep();
 f1.sleep();
 System.out.println();
 //p1.listen();
 s1.listen();
 //f1.listen();
 s1.write();
 s1.read();
 s1.reply();
 }
}