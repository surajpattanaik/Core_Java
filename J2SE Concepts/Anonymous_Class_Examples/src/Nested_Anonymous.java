
public class Nested_Anonymous {
	public static void main(String[] args)
	{
		Nested_Anonymous n1= new Nested_Anonymous() {
			Nested_Anonymous n2= new Nested_Anonymous() {	
				Nested_Anonymous n3= new Nested_Anonymous() {
					Nested_Anonymous n4= new Nested_Anonymous() {
						
					};
				};
			};
		};
		System.out.println(n1);//Nested_Anonymous$1@15db9742
	
	}

}
