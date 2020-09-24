import java.util.*;
public class Linkedlist_Ex {
public static void main(String[] args) {
	LinkedList<Integer>list=new LinkedList<Integer>();
	System.out.println(list);
	list.addFirst(11);
	list.addLast(22);
	list.add(1,33);
	list.addFirst(22);
	System.out.println(list);
	Object arr[] =list.toArray();
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
