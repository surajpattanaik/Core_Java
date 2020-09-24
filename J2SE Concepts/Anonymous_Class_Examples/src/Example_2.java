//Creating the object of abstract class with the help of anonymous class
abstract class Example_2 {
	abstract void area();		
	}
class Demo
{
	public static void main(String[] args) {
		Example_2 e1=new Example_2()
				{
			void area()
			{
				System.out.println("Area of circle...");
			}
				};
				Example_2 e2=new Example_2()
						{
					void area()
					{
						System.out.println("Area of rect...");
					}
						};
						e1.area();
						e2.area();
						
	}
}

