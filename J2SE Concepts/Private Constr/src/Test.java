
public class Test {
int x=10;
private static int count=0;
private Test() {
	System.out.println("Test:Private Constr");
}
public static Test getobjectt() {
	Test obj=null;
	if (count==0) {
		obj=new Test();
		
	}
	count++;
	return obj;
}
}
class Demo {
public static void main(String[] args) {
//Test t1=new Test();//Error
	Test t1=Test.getobjectt();
	Test t2=Test.getobjectt();
	Test t3=Test.getobjectt();
	System.out.println(t1+"\t"+t2+"\t"+t3);
	System.out.println(t1.x);
	}
}
