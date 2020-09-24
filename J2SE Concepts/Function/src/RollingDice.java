
public class RollingDice {
public int RollDice(int sides) {
double randomNumber = Math.random();
randomNumber = randomNumber*sides;
randomNumber += 1;
int randomInt=(int) randomNumber;
int roll1 = RollDice(6);
int roll2 = RollDice(6);
System.out.println("Roll 1: " + roll1);
System.out.println("Roll 2: " + roll2);
return randomInt;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RollingDice m = new RollingDice();
m.RollDice(6);
}
}