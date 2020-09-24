//example of command line argument.
class Test
{
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println("10"+20);
		System.out.println(3+5+"10"+5+3);
		System.out.println(3+5+"10"+5*3);
		System.out.println(args[0]+args[1]);
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(Integer.parseInt("10")+3);
		}
}
//for args 10 & 20 o/p ...
//2
//1020
//81015
//1020
//30
//13
