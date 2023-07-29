/*
 * Authors: Nicholas Kang, Brandon Arriaga
 * Group 10 JAVA
 *
 * Lab 3
 *
 * Purpose: The Queue is derived from the linked list, can enQueue elements to the end of a Queue,
 * deQueue from the start of the Queue, and peek the front and back of the Queue. It uses the start and end
 * attributes to get data and set new elements.
 *
 */
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


		Currency currency = start.getData();

		if (currency != null) {
			return currency;
		}
		return null;
		
	}
	
	public Currency peekRear() {

		Currency currency = end.getData();

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
