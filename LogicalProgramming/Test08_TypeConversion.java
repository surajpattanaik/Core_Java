class Test08_TypeConversion {
public static void main(String[] args){

float f1 = 10;
System.out.println("f1: "+f1);
//DT dv = sv; //assignemnt
/* //DT dv = (DT)sv; //casting
/*
1. = operator float f = 10; -->AC
2. cast operator int i = (int)10.0; --> Casting

Rule #1: ST and DT must be compatible
Rule #2: STR <= DTR
*/

//All are getting voice, if you are not getting pls rejoin

System.out.println();
int i2 = 5; System.out.println("i2: " + i2);
long l2 = 5; System.out.println("l2: " + l2);
float f2 = 5; System.out.println("f2: " + f2);

System.out.println();
// int i3 = true;
// int i4 = 10.0;

int i5 = (int)10.0; System.out.println("i5: "+i5);
// int i6 = (int)true;

//Rule #1: COT and ST compatible

//Rule #2: COT and DT compatible
//Rule #3: COTR <= DTR

// int i6 = true;
// int i7 = (int)true;
// boolean b5 = (byte)i5;
// byte b6 = (short)i5;

System.out.println();

int i8 = 10; System.out.println("i8: "+i8);
// byte b3 = i8;
byte b4 = (byte)i8; System.out.println("b4: "+b4);
System.out.println();

//Summary
// HRD <- LRD (AC)
byte b6 = 5;
int i6 = b6;

//LRD <- HRD (CE: p l c ->sol -> casting)
int i9 = 5;
// byte b7 = i9;
byte b8 = (byte)i9;
System.out.println("i9: "+i9);
System.out.println("b8: "+b8);
System.out.println();

//testcase 1
int i10 = 254; // SV - byte range tot
byte b9= (byte)i10; // 254 - 256 => -2
System.out.println(i10);
System.out.println(b9);
System.out.println();

//test case 2
int i11 = -254; //SV + byte range tot
byte b10 = (byte)i11; //-254 + 256 => 2
System.out.println(i11);
System.out.println(b10);
System.out.println();

//test case 3 //SV - COT Range
int i12 = 1000; //1000 - 256
byte b11 = (byte)i12; //744 - 256
System.out.println(i12); //488 - 256
System.out.println(b11); //232 - 256
System.out.println(); //-24

//multiple cast operators
int i13 = 10;
byte b15 = (byte)(short)i13;
System.out.println(b15);

int i14 = 97;
byte b16 = (byte)(short)(char)(double)i14;
// byte b17 = (byte)(char)(boolean)(double)i14;

int i15 = 5;
short s12 = (short)(byte)i15;

int i16 = 254;
short s13 = (short)(byte)i16;

System.out.println(s12);
System.out.println(s13);
System.out.println();

//AC and Cast operator rules
int i131 = 254;

// byte b121 = i131;
byte b131 = (byte)i131;

// boolean bo11 = i13;
// boolean bo12 = (boolean)i13;
// boolean bo13 = (byte)i13;
// byte b14 = (short)i13;
/**/
}
}

class Test09_TypeConversion_TC1{
public static void main(String[] args) {

long l1 = 5;
float f1 = l1;

System.out.println(l1);
System.out.println(f1);
System.out.println();

float f2 = 10;
// long l2 = f2;
long l3 = (long)f2;
System.out.println(f2);
System.out.println(l3);
System.out.println();

// long l4 = 9223372036854775807;
long l5 = 9223372036854775807L;
System.out.println(l5);

// float f4 = 9223372036854775807;
float f5 = 9223372036854775807L;
System.out.println(f5);
System.out.println((long)f5);

/* */
}
}

class Test09_TypeConversion_TC2{
public static void main(String[] args) {

char ch1 = 'a';
char ch2 = 97;
System.out.println(ch1);
System.out.println(ch2);
System.out.println();

int i1 = 98;
int i2 = 'b';
System.out.println(i1);
System.out.println(i2);
System.out.println();

char ch3 = 255; System.out.println(ch3);
char ch4 = 260; System.out.println(ch4);
char ch5 = 65000; System.out.println(ch5);
// char ch6 = 66000; System.out.println(ch6);

System.out.println();

char ch8 = 'a';
int i3 = ch8;
System.out.println(ch8);
System.out.println(i3);
System.out.println();

int i4 = 97;
// char ch9 = i4;
char ch10 = (char)i4;
System.out.println(i4);
System.out.println(ch8);
System.out.println();

byte b1 = 'a'; System.out.println(b1);
short s1 = 'a'; System.out.println(s1);
System.out.println();

char ch11 = 'a';
// byte b2 = ch11;
// short s2 = ch11;

byte b2 = (byte)ch11;
short s2 = (short)ch11;
System.out.println(b2);
System.out.println(s2);
System.out.println();

byte b3 = 97;
// char ch12 = b3;
char ch13 = (char)b3;
System.out.println(b3);
System.out.println(ch13);
System.out.println();

short s3 = 98;
// char ch14 = s3;
char ch15 = (char)s3;
System.out.println(s3);
System.out.println(ch15);
System.out.println();

final char ch16 = 'a';
byte b4 = ch16;
System.out.println(ch16);
System.out.println(b4);
System.out.println();

final byte b5 = 97;
char ch17 = b5;
System.out.println(b5);
System.out.println(ch17);

}
}

class Test09_TypeConversion_TC5{
public static void main(String[] args) {

byte b1 = 5;
byte b2 = 'a';

float f1 = 5.0;

int i1 = 5L;
int i2 = 5F;

}
}