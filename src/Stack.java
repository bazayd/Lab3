public class Stack extends SinglyLinkedList{
    
	
	public Stack(LinkNode start, LinkNode end) {
        super(start, end);
    }
	
	public void push(Currency obj) {
		/*
		 * increase object count
		 * create new node
		 * newNode.next = null
		 * new node.data = obj data
		 */
		
		/*
		 * start is bottom/tail of stack
		 * end is top/head of stack
		 */
		this.setCount(this.getCount() + 1);
		LinkNode newNode = new LinkNode(obj);
		
		LinkNode top = getStart();
		newNode.setNext(top);
		setStart(newNode);
		
//		LinkNode bottom = getStart();
//		LinkNode top = getEnd();
//		LinkNode nextNode;
//		
//		if (this.getCount() == 0) {
//			top = newNode;
//			bottom = top;
//			nextNode = null;
//		}else {
//			top = newNode;
//			nextNode = bottom.getNext();
//		}
		
		
		
	}
	
	public Currency pop() {
		
		this.setCount(this.getCount() - 1);
		LinkNode topNode = getStart();
		Currency removed = topNode.getData();
		setStart(topNode.getNext());
		return topNode.getData();
		
	}
	
	public Currency peek() {
		LinkNode top = getStart();
		return top.getData();
		
	}
	
	public void printStack() {
		LinkNode cur = getStart();
		while(cur != null) {
			System.out.println(cur.getData()+ " ");
			cur = cur.getNext();
		}
	}
}
