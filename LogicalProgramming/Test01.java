interface IFruit
//class IFruit
{
	 String TYPE ="banana";
}
class Fruit implements IFruit
//class Fruit extends IFruit
{

}
public class Test01 extends Fruit
{
	public static void main(String args[]){
		 class Constant
		{
			final static String TYPE = "apple";
               
		}
		//System.out.println(Constant.TYPE);
		System.out.println(TYPE);
	}
}