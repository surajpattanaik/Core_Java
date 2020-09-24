import java.util.*;
public class ArrayList_Ex {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add(input());
		list.add(input());
		list.add(0,input());
		list.add(2,input());
		
		System.out.println(list);
		
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("A");
		list1.add(0,"A");
		list1.add("C");
		list1.add(1,"D");
		System.out.println(list1);
		list.addAll(2,list1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(list.contains("A"));
		System.out.println(list.indexOf("A"));
		System.out.println(list.lastIndexOf("A"));
		System.out.println(list.size());
		
		
	}
	
	public static String input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		return sc.next();
		
	}

}
