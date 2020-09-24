class wrapperClassDemo
{
	public static void main(String args[]) {

	int i = 10;
	System.out.println("i : "+i);
	
	//1.PDT to WCO conversion...
	//===========================
	Integer io1 = new Integer(i);
	Integer io2 = Integer.valueOf(i);
    System.out.println("io1 : "+io1);
	System.out.println("io2 : "+io2);

	//Byte b1= new Byte(50);//CE
	Byte b2 = new Byte((byte)50);
	System.out.println("b2 : "+b2);

    Character ch1 = new Character('a');
	System.out.println("ch1 : "+ch1);
    //Character ch2 = new Character(97);//CE
	Character ch3 = new Character((char)97);
	System.out.println("ch3 : "+ch3);

	Boolean boo = new Boolean(true);
	System.out.println("boo : "+boo);

	Float f1 = new Float(70);
	System.out.println("f1 : "+f1);
	Float f2 = new Float(32.56f);
	System.out.println("f2 : "+f2);
	Float f3 = new Float(50.45);
	System.out.println("f3 : "+f3);

	Double d1 = new Double(67.54);
	System.out.println("d1 : "+d1);
	Double d2 = new Double(98);
	System.out.println("d2 : "+d2);
	Double d3 = new Double('a');
	System.out.println("d3 : "+d3);


   //2. WCO to PDT conversion ...
   //============================

   Integer io3 = Integer.valueOf(254);
   int x = io3.intValue();
   byte b = io3.byteValue();
   short s = io3.shortValue();
   float f = io3.floatValue();
   
   System.out.println("x : "+x);
   System.out.println("b : "+b);
   System.out.println("s : "+s);
   System.out.println("f : "+f);
   
   //char ch4 = io3.charValue();//can not find symb
   //char ch5 = io3.intValue();//incompatible type: possible lossy conv
     char ch6 = (char)io3.intValue();
	 
	 //boolean bo1 = io3.booleanValue();//C F S
	 // boolean bo2 = io3.intValue();// ICT
     //boolean bo3 = (boolean)io3.intValue();
     

	 //3.PSO to WCO conversion...
	 //===========================


	 Integer io4 = new Integer("10");
	 Integer io5 = Integer.valueOf("1");

	 Byte b3 =Byte.valueOf("1");
	 Byte b4 =Byte.valueOf("1");//no error
	 System.out.println(b3 == b4);//true
    
	//Byte b4 =Byte.valueOf("128");//RE, out of range
	//Integer io6 = Integer.valueOf("a");//RE
	//Integer io7 = Integer.valueOf("5.4");
	//Integer io8 = Integer.valueOf("5L");

	Float f4 = Float.valueOf("5.4");//No error
     System.out.println("f4 : "+f4);//5.4
    Double d4 = Double.valueOf("90");//No error
     System.out.println("d4 : "+d4);//90.0

	 Float fo1 = new Float("5");
	 Float fo2 = new Float("5.4");
	 Float fo3 = new Float("567.432F");

	 System.out.println("io4 : "+io4);
	 System.out.println("io5 : "+io5);
	 System.out.println("b3 : "+b3);
	 System.out.println("fo1 : "+fo1);
	 System.out.println("fo2 : "+fo2);
	 System.out.println("fo3 : "+fo3);


     
	 //Boolean string obj to Boolean WCO
	 //"false" | "true" => WCO==========










	}
}