public class Queue extends SinglyLinkedList{


	
	public Queue() {
		super();
	}

	public Queue(LinkNode start, LinkNode end) {
		this.count = 0;
		this.start = start;
		this.end = end;
	}

	
	public void enQueue(Currency currency) {


		LinkNode node = new LinkNode(currency);

		if (isListEmpty()) {
			start = node;
		}else {

			end.setNext(node);
		}
		end = node;
		count++;
	}
	
	public Currency deQueue() {

//		if (isListEmpty()) {
//			throw new IllegalArgumentException("Cannot deQueue from an empty Queue.");
//		}

		Currency currency = start.getData();


		start = start.getNext();


		if(isListEmpty()) {
			end = null;
		}
		count--;
		return currency;
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
		StringBuilder queueString = new StringBuilder();
		LinkNode node = start;

		while (node != null) {
			queueString.append(node.getData().toString()).append("\n");
			node = node.getNext();
		}
		System.out.println(queueString);
	}
}
