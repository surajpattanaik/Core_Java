import java.io.*;
import java.net.*;
public class read_url {
	public static void main(String[] args) throws Exception {
	URL u1=new URL("https://github.com/surajpattanaik/-Java-Codes-J2SE-Edition/blob/master/J2SE%20codes/eclipse-workspace/Hello%20world%20lol/src/HelloWorld.java");
    URLConnection u2=u1.openConnection();
    InputStream is=u2.getInputStream();
    boolean i;
    while(i=is.read()!= -1) {
    	System.out.println((Char)i);
    	
    }
	}

}
