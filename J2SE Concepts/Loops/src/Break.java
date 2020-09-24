
public class Break {
public boolean rollasix()
{
	int  dice=rollDice();
	while(dice !=6)
	{
		dice=rollDice();
		if(dice==3)
		{
			System.out.println("You lose");
		}
			break;
	}
	if(dice==6) {
		System.out.println("You won");
		return true;
	}
	
	else {
		System.out.println("Repeat");
	return false;
	}
	
	
}
	private int rollDice() {
	// TODO Auto-generated method stub
	return 0;
}
	public static void main(String[] args) {
		Break b=new Break();
		b.rollasix();
		// TODO Auto-generated method stub

	}

}
