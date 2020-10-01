
public class Thread2 extends Thread {
Add a;
Thread2(Add a2){
	this.a=a2;
}
public void run() {
	a.add(70,80);
}
}
