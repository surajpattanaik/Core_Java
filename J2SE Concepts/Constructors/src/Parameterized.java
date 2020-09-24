
public class Parameterized {
	int roll;
	String name;
	Parameterized (int r, String n) {
		roll=r;
		name=n;
	}
	public static void main(String[] args) {
		Parameterized s1=new Parameterized(100,"Suraj");
		Parameterized s2=new Parameterized(200,"MRSuraj");
		System.out.println(s1.roll+"\t" + s1.name);
		System.out.println(s2.roll+"\t" + s2.name);
	}

	}


