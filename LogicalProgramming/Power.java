class Power
{
	int calcPower(int n, int p){
		if(p<1){
			return 1;
		}
		return n*calcPower(n,p-1);
	}
	public static void main(String args[]){
	Power p = new Power();
	System.out.println(p.calcPower(4,3));
	}
}