
    class Long_Integer_BigInteger {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		Long x=10L;
		System.out.println(x);
		Integer f=1;
		for(Integer i=1; i<=55; i++) {
		f = f * i ;
		}//factorial with Integer
		System.out.println("fact is: " +f);
		java.math.BigInteger f1=new java.math.BigInteger("1");
		for(Integer i=1; i<=55555; i++) {
		
			f1 = f1.multiply(new java.math.BigInteger(" "+ i));
		}//factorial with BigIntegerf
		System.out.println("fact is "+f);
		
	}

}
