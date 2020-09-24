
public class Test {

	public static void main(String[] args )throws java.io.IOException {
    java.io.InputStreamReader isr=new java.io.InputStreamReader(System.in);
    java.io.BufferedReader br=new java.io.BufferedReader(isr);
    System.out.println("Enter the name");
    String name=br.readLine();
    System.out.println("Enter the roll");
    int roll=Integer.parseInt(br.readLine());
    System.out.println("Enter the cgpa");
    double cgpa=Double.parseDouble(br.readLine());
    System.out.println("---------------");
    System.out.println("Hi "+name);
    System.out.println("Your Roll is "+roll);
    System.out.println("And cgpa is "+cgpa);
	}

}
