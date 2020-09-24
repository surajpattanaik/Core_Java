class A
{
}
class Test01 implements Cloneable{
A a = new A();
public static void main(String args[])throws CloneNotSupportedException {
Test01 t1 = new Test01();
Test01 t2 = (Test01)t1.clone();
System.out.println(t1.a == t2.a);
}
}
