package collections;
// SinglyLinkedListNode
public class SinglyLinkedList implements LinkedList<Integer> {
	public SinglyLinkedList next;
	public int data; // Integer is a wrapper class for int.

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
		// this.addnode(data);
		// this is the reference of the object that has been used to invoke "addNode()" method
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
	public SinglyLinkedList find(SinglyLinkedList head , int x)
	{
		SinglyLinkedList t = head;
		while(t != null)
		{
		  if(t.data == x)
			  return t;
			t = t.next;
		}
		return null;
	}
        public void deleteNode(SinglyLinkedList head,int x){
		SinglyLinkedList f = find(head,x);
		
	}
        public int sizeOf(){return -1;}
        public Integer find(){return -1;}
        public void replace(){}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.addNode(10);
		// this refers to the object that is used to call this method
	}	
}
