class Factorial 
{
	int calcFact(int n){
		if(n<1){
			return 1; }else{
	 return n*calcFact(n-1); }
	}
	public static void main(String args[]){
    Factorial f = new Factorial();
	System.out.println(f.calcFact(5));
	}
}