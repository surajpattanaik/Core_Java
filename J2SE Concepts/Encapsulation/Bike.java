class Bike
{
private int gear;
public void setGear(int g) {
	if(g <= 5 && g > 0) {
		this.gear = g;
		System.out.println("Your Bike is running on gear "+ gear);
	}
		else {
			System.out.println(" Invalid gear, please choose in between 0 & 5" );
		}
	
}
public int getGear() {
	return gear;
}

}