import java.util.Scanner;
public class MusicPlayer {
private static Scanner s;
public void playmusic() {
	s=new Scanner(System.in);
	System.out.println("ClicK PlayButton?");
	boolean bn = s.nextBoolean();
	if(bn)
	{
		System.out.println("Play Music");
	}
	else {
		System.out.println("Don't play Music");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MusicPlayer b = new MusicPlayer();
b.playmusic();
	}

}
