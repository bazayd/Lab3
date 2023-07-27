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
		
		LinkNode bottom = getStart();
		LinkNode top = getEnd();
		LinkNode nextNode = bottom.getNext();
		
		if (top == null) {
			top = newNode;
			bottom = top;
			nextNode = null;
		}else {
			top = newNode;
		}
		
		
	}
	
	public Currency pop() {
		
		this.setCount(this.getCount() - 1);
		LinkNode topNode = getEnd();
		return topNode.getData();
		
	}
	
	public Currency peek() {
		LinkNode top = getEnd();
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
