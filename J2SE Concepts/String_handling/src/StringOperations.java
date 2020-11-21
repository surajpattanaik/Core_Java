public class StringOperations {
 public static void main(String[] args) {
	String s = "Java programming language";
	
	//finding string is empty or not
	System.out.println(s.isEmpty());
	
	//finding length of the string
	System.out.println(s.length());
	
	String s1 ="";
	String s2=" ";
	String s3 = new String("");
	
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	System.out.println(s3.isEmpty());
	
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(s3.length());
	
	
	//printing string object
	System.out.println(s);
	
	//comparing two strings 
	String s4 = new String("abc");
	String s5 = new String("abc");
	String s6 = new String("Abc");
	
	System.out.println(s4==s5); //false bcz different references
	System.out.println(s4.equals(s5)); // true bcz both obj has same state
	
	System.out.println(s5==s6); //false
	System.out.println(s5.equals(s6)); //false
	
	//comparing strings without case, below method is defined in string class
	//public boolean equalsIgnoreCase(string s)
	
	String s7 = new String("a");
	String s8 = new String("A");
	
	System.out.println(s7.equals(s8));
	System.out.println(s7.equalsIgnoreCase(s8));
	
	
	//comparing strings lexicographically
	String s9 = new String("a");
	String s10 = new String("A");
	System.out.println( s9.compareTo(s10));
	System.out.println( s9.compareToIgnoreCase(s10));
	
	String s11 = new String("abc");
	String s12 = new String("abcdef");
	System.out.println( s11.compareTo(s12));//returns length difference which is -3.
	String s13 = new String("abc");
	System.out.println( s12.compareTo(s13));

	
	//indexOf() testcases
	String s14 = "I am a Java Developer";
	
	System.out.println(s14.indexOf('a'));
	System.out.println(s14.lastIndexOf('a'));
	
	System.out.println(s14.indexOf('d'));
	System.out.println(s14.indexOf("Dev"));
	
	System.out.println(s14.indexOf('a',7));
	System.out.println(s14.lastIndexOf('a',7));
	
	System.out.println(s14.indexOf('a',2));
	System.out.println(s14.lastIndexOf('a',2));
	
	System.out.println(s14.indexOf('a',-5));
	System.out.println(s14.lastIndexOf('a',-5));
	
	System.out.println(s14.indexOf('a',250));
	System.out.println(s14.lastIndexOf('a',250));
	
	
	//startsWith() and endsWith()
	String s15 = "Java Programming language";
	System.out.println(s15.startsWith("Java"));
	System.out.println(s15.startsWith("java"));
	System.out.println(s15.startsWith("ava"));
	
	System.out.println(s15.endsWith("age"));
	System.out.println(s15.endsWith("language"));
	System.out.println(s15.endsWith("Language"));
	
	//print character of the given index
	String s16 = "Java is good";
	System.out.println("character at 5th index in s16 string: "+s16.charAt(5));
	
	//print all characters in given string with index
	for(int i=0; i<s16.length(); i++) {
		System.out.print("Character at index "+i+" is: " +s16.charAt(i));
		System.out.println();
	}
	//contains
	System.out.println(s16.contains("good"));
	System.out.println(s16.contains("GOOD"));
	
	
	//substring()
	String s17 ="This is string handling";
	System.out.println(s17.substring(4));
	System.out.println(s17.substring(5,6));
	System.out.println(s17.substring(5,7));
	//System.out.println(s17.substring(5,70));
	//System.out.println(s17.substring(-5,7));
	System.out.println(s17.substring(5,5));//empty string
	///testing
	String s19 = s17.substring(5,5);
	System.out.println(s19=="");
	System.out.println(s19.isEmpty());//isEmpty method checks is the String is empty or not including SPACE
	System.out.println(s19.isBlank());//isBlank method checks is the String is empty or not excluding SPACE
	System.out.println(s17.substring(s17.indexOf("T"), s17.indexOf("s")+1));
	System.out.println(s17.substring(s17.indexOf("T"), s17.lastIndexOf("g")+1)+" yay!!!");
	
	//reverse a string using spilt method..
	String words = "Java Programming Language";
	String[] splitString=words.split(" ");
	String reversedString="";
	for (int i = splitString.length-1; i>=0  ; i--) {
		reversedString += splitString[i]+" ";
	}
	System.out.print(reversedString);


	
	//replace a charcter/string with given char/string..
    String s20="aaa bbb c d eee fff aa bb";
	String s21=s20.replace('a','l');
    System.out.println("String s20= "+s20);
	System.out.println("String s21= "+s21);

	String s22=s20.replaceAll("a","t");
	System.out.println("String s20= "+s20);
	System.out.println("String s22= "+s22);

	String s23=s20.replaceAll("aaa","t");
	System.out.println("String s20= "+s20);
	System.out.println("String s22= "+s23);

	String s24=s20.replaceFirst("a","t");
	System.out.println("String s20= "+s20);
	System.out.println("String s24= "+s24);

    String s25=s20.replaceFirst("aa","t");
	System.out.println("String s20= "+s20);
	System.out.println("String s25= "+s25);

	//trim method to delete trailing and leading spaces..
	String s26=new String(" Suraj Kumar ");
	System.out.println("String s26 length= "+s26.length());
	System.out.println("String s26= "+s26);
	String s27=s26.trim(); //it will not remove middle spaces
	System.out.println("String s27 length= "+s27.length());
	System.out.println("String s27= "+s27);

	String s28="Suraj Kumar";
	System.out.println(s26==s27);
	System.out.println(s27==s28);

	String s29=" Suraj Kumar ";
    String s30=s29.trim();
	System.out.println(s29==s26);
	System.out.println(s28==s30);
	System.out.println(s29);
	System.out.println(s30);


	//count the total no of characters present in the string
	int count=0;
	String s31="Java Programming Language";
	//approach-1
	try{
	for(int i=0; true; i++){
		s31.charAt(i);
		count++;
	}
	} catch(Exception e){}
	System.out.println("length of String s31 is: "+count);

	//approach-2, more optimized approach
	try{
	while(true){
		s31.charAt(count);
		count++;
	}
	} catch(Exception e){}
	System.out.println("length of String s31 is: "+count);

	//ap-4, using charArray
	char[] c1=s31.toCharArray();
	System.out.println(c1);
	System.out.println("length of String s31 in charArray is: "+c1.length);

	//ap-4, using ByteArray
	byte[] b1=s31.getBytes();
	System.out.println(b1);
	System.out.println("length of String s31 in ByteArray is: "+b1.length);


	//StringBuffer Constructers..
	StringBuffer sb = new StringBuffer();
	System.out.println("sb: "+sb);//sb:
	System.out.println("sb capacity: "+sb.capacity());//16(default)

	StringBuffer sb1 = new StringBuffer(3);
	System.out.println("sb1: "+sb);//sb1:
	System.out.println("sb1 capacity: "+sb1.capacity());//3

	StringBuffer sb2 = new StringBuffer("suraj");
	System.out.println("sb2: "+sb2);//sb2: suraj
	System.out.println("sb2 capacity: "+sb2.capacity());//21
	
	System.out.println();
	
	
	//=====================================================================================
	
	String s40 = null+"a";   System.out.println(s40);
	String s41 = 4+5+"a"+null;   System.out.println(s41);
	String s42 = null;   System.out.println(s42);
	// System.out.println(s42.toUpperCase());  //NPE
	//String s43 = new String(null); //CE
	StringBuilder s44 = new StringBuilder();
	s44.append("a");
	s44.append("null"); System.out.println(s44);
	//s44.append(null); //CE
	s40.concat("b"); System.out.println(s40); //original value
	s40=s40.concat("b"); System.out.println(s40); //modified value
	
	//==============StringBuffer/Builder methods======================================
	StringBuffer s45 = new StringBuffer();
	StringBuilder s46 = new StringBuilder();
	s45.append("abcd"); System.out.println(s45);
	s46.append("1234"); System.out.println(s46);
	
	s45.insert(4,"e"); System.out.println(s45);
	s46.insert(4,"5"); System.out.println(s46);
	s45.insert(1,"f"); System.out.println(s45);
	s46.insert(1,"6"); System.out.println(s46);
	
	s45.delete(1,2); System.out.println(s45);
	s46.delete(1,2); System.out.println(s46);
	
	s45.deleteCharAt(4); System.out.println(s45);
	s46.deleteCharAt(4); System.out.println(s46);
	
	s45.reverse(); System.out.println(s45);
	s46.reverse(); System.out.println(s46);
	
	s45.setCharAt(0,'c'); System.out.println(s45);
	s46.setCharAt(0,'3'); System.out.println(s46);

    
	//==============ensure capacity=========================
	StringBuffer s47 = new StringBuffer(); System.out.println(s47.capacity());
	StringBuilder s48 = new StringBuilder(); System.out.println(s48.capacity());
	
	StringBuffer s49 = new StringBuffer("hello"); System.out.println(s49.capacity());
	StringBuilder s50 = new StringBuilder("hello"); System.out.println(s50.capacity());
	
	s49.ensureCapacity(17); System.out.println("s49 capacity "+s49.capacity()); //21
	s50.ensureCapacity(20); System.out.println("s49 capacity "+s50.capacity()); //21
	
	s49.ensureCapacity(25); System.out.println("s49 capacity "+s49.capacity()); //44
	s50.ensureCapacity(25); System.out.println("s49 capacity "+s50.capacity()); //44
	
	s49.ensureCapacity(100); System.out.println("s49 capacity "+s49.capacity()); //
	s50.ensureCapacity(100); System.out.println("s49 capacity "+s50.capacity()); //
	
	s47.ensureCapacity(17); System.out.println(s47.capacity()); //16*2+2=34>17? then 34
	s48.ensureCapacity(20); System.out.println(s48.capacity()); //same 34
	
	s47.ensureCapacity(40); System.out.println(s47.capacity()); //34*2+2=70>40? then 70
	s48.ensureCapacity(40); System.out.println(s48.capacity()); //70
	
	s47.ensureCapacity(150); System.out.println(s47.capacity()); //70*2+2=142>40? so 150
	
	
	//=================trimtosize=======================================================
	
	s47.trimToSize(); System.out.println(s47.capacity()); //o/p : 0
	s49.trimToSize(); System.out.println(s49.capacity()); //o/p : 0
	s50.trimToSize(); System.out.println(s50.capacity()); //o/p : 0
	
	//===================setLength======================================================
	System.out.println();
	System.out.println(s49.length());
	s49.setLength(7);
	System.out.println(s49.length());
	System.out.println(s49);
	
	s49.setLength(5);
	System.out.println(s49.length());
	System.out.println(s49);
	
	s49.append("there");
	System.out.println(s49);
	
	System.out.println(s49.length());
	s49.setLength(15);
	System.out.println(s49.length());
	
	s49.setLength(5);
	System.out.println(s49.length());
	System.out.println(s49);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
}
