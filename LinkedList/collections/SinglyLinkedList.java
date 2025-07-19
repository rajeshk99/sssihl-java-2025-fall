package collections;

public class SinglyLinkedList implements LinkedList<Integer> {
	public SinglyLinkedList next;
	public Integer data;

	// for, while, do...while()
	// while(predicate){}
	// predicate is nothing but a boolean expression which evaluates to true or false
	// for(int i=?;predicate;i++){}
	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	// for (int i : array) {}
	// do...while(predicate)
	// break; continue;
	
	public void addNode(Integer data) {
		SinglyLinkedList temp = this;
		do {
			// && is a logical operation in java
			// & is a bitwise operation in java
			if(temp.next == null) {
				SinglyLinkedList next = new SinglyLinkedList();
				next.data = data;
				temp.next = next;
				break;
			}
			temp = temp.next;
		} while(temp != null);
	}

        public void deleteNode(){}
        public int sizeOf(){return -1;}
        public Integer find(){return -1;}
        public void replace(){}
}
