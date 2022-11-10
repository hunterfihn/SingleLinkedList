public class LLDriver {

	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
		
		/*Node nodeA = new Node(13);
		Node nodeB = new Node(65);
		Node nodeC = new Node(39);
		Node nodeD = new Node(14); */
		
		list.appendit(28);
		list.appendit(65);
		list.appendit(39);
		list.appendit(14);
		
		System.out.println("Length: " + list.length());
		
		
		System.out.println("unsorted list: ");
		list.display();
		
		list.bubbleSort();
		
		System.out.println("sorted list: ");
		list.display();
		
	}
}