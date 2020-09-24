
public class Weather {

public void weatherInterpreter(int temp) {

if(temp>30)
{
	System.out.println("It's hot outside!");
}
else if(temp<5)
{
	System.out.println("Brr,consider wearing a jacket!");
}
else
{
	System.out.println("Not too hot, not too Cold!");
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Weather n = new Weather();
n.weatherInterpreter(7);
	}

}
