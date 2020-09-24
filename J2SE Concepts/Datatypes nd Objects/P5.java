//mapping program in System.out.println();
class Test
{
	void show()
	{
		System.out.println("java is simple");
	}
}
class Demo
{
 static Test t= new Test();
}
class Demo1
{
	public static void main(String[] args) {
        Demo.t.show();
 		Demo d=new Demo();
		d.t.show();

	}

}