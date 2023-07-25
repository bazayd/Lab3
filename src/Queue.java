public class Queue extends SinglyLinkedList{


	
	public Queue(int count, LinkNode start, LinkNode end) {
		super(count, start, end);
	}
	
	public void enQueue(Currency obj) {

		LinkNode front = getStart();
		LinkNode rear = getEnd();
		LinkNode next = rear.getNext();
		int count = getCount();

		LinkNode temp = new LinkNode(obj);

		if (front == null) {
			rear = temp;
			front = rear;
		}else {
			next = temp;
			rear = next;
		}
		++count;
	}
	
	public Currency deQueue() {
		LinkNode front = getStart();
		LinkNode rear = getEnd();
		int count = getCount();


		if(front != null) {
			Currency removed = front.getData();
			front = front.getNext();
			--count;
			return removed;
		}
		return null;
	}
	
	public Currency peekFront() {

		LinkNode front = getStart();
		Currency currency = front.getData();

		if (currency != null) {
			return currency;
		}
		return null;
		
	}
	
	public Currency peekRear() {

		LinkNode rear = getEnd();
		Currency currency = rear.getData();

		if (currency != null) {
			return currency;
		}

		return null;
	}
	
	public void printQueue() {
		LinkNode node = getStart();

		while (node != null) {
			System.out.println(node.getData()+" ");
			node = node.getNext();
		}
	}
}
