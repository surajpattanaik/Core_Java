//Develop a program
//1. To store multiple values individually with diff names and single names as grp.
//2. To store multiple objects individually with diff names and with single name as grp.
//3. Define parameterized methods to pass both values and objects individually and as grp. 


class Test05
{
	public static void main(String[] args){
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		System.out.println(i1 +" " +i2+" " +i3);
		m1(i1,i2,i3);
		System.out.println();
//===============================================
Example e1= new Example();
Example e2= new Example();
Example e3= new Example();
System.out.println(e1+" "+e2+" "+e3);
m2(e1.e2,e3);
System.out.println();
//================================================
int[] ia= {10,20,30};
System.out.println(ia);
System.out.println(java.util.Arrays.toString(ia));
m3(ia);
System.out.println();
Example[] ea = { new Example(), new Example(), new Example() };
System.out.println(ea);
System.out.println(java.util.Arrays.toString(ea));
m4(ea);
System.out.println();
}
static void m1(int p, int q, int r) {
System.out.println(e1 +" "+e2+" "+e3);
}
static void m2(Example e1, Example e2, Example e3) {
System.out.println(e1 +" "+e2+" "+e3);
}
static void m3(int[] s){
System.out.println(s);	
System.out.println(java.util.Arrays.toString(s));
}
static void m4(Example[] ea){
System.out.println(ea);	
System.out.println(java.util.Arrays.toString(ea));
}
}
