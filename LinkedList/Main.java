import collections.*;

public class Main {
	public static void main(String... args) {
		LinkedList<Integer> head = new SinglyLinkedList ();
		((SinglyLinkedList) head).data = 10;
		head.addNode(200);
		head.addNode(30);
		head.addNode(40);
		head.addNode(50);
		head.delete(40);
		SinglyLinkedList temp = (SinglyLinkedList) head;	
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
