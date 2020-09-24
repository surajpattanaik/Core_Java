class CheckPrime
{
	public static void main(String args[]){
	int n=1;
	int temp = 0;
	for(int i=2; i<n; i++){
		if(n%i == 0){
			temp++;
			break;
		}
			else { temp=0; }
	}
	if(n<2) { temp++; }

	if(temp > 0){
		System.out.println(n+ 
			" is not a prime no "+ temp);
	}
	else{
        System.out.println(n+  
			" is a prime no "+ temp); }
}
}