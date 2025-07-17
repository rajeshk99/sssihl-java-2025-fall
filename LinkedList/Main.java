import collections.LinkedList;
import collections.*;

public class Main {
	public static void main(String... args) {
		LinkedList<Integer> head = new SinglyLinkedList ();
		((SinglyLinkedList) head).data = 10;
		head.addNode(20);
		head.addNode(30);
		head.addNode(40);
		head.addNode(50);
		
		SinglyLinkedList temp = (SinglyLinkedList) head;	
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
