public class Stack extends SinglyLinkedList{
    
	/*
	 * end is top of stack
	 * start is bottom of stack
	 */
	public Stack(int count, LinkNode start, LinkNode end) {
        super(count, start, end);
    }
	
	public void push(Currency obj) {
		/*
		 * increase object count
		 * create new node
		 * newNode.next = null
		 * new node.data = obj data
		 */
		this.setCount(this.getCount() + 1);
		LinkNode newNode = new LinkNode(obj);
		//LinkNode newNode = new LinkNode(obj.getData(), obj.getNext());
		//newNode.setData() = obj.getData();
		
	}
	
	public Currency pop() {
		
		this.setCount(this.getCount() - 1);
		LinkNode top = getEnd();
		return top.getData();
		
	}
	
	public Currency peek() {
		LinkNode top = getEnd();
		return top.getData();
		
	}
	
	public void printStack() {
		for (int n = 0; n < this.getCount(); n++) {
			//System.out.println("")
		}
	}
}
