package control;
import java.util.*;
public class Collection {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("faaiz");
	list.add("gaurav");
	list.add("Kshitiz");
	list.add("faaiz");
	Iterator itr = list.iterator();
	while(itr.hasNext()){ 
		System.out.println(itr.next());
		
	}
}
}
