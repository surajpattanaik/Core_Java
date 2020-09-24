class FindGross
{
	public static void main(String[] args) {
		double salary = Double.parseDouble(args[0]);
		double da = salary * .10;
		double ta = salary * .20;
		double hra = salary * .30;
		double gross = salary + ta + da + hra;
		System.out.println("Gross is : "+gross);
		double it = salary * .05;
        double netsalary = gross - it;
        System.out.println("Net is : "+netsalary);
	}
}