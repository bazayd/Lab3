/*
 * Authors: Nicholas Kang, Brandon Arriaga
 * Group 10 JAVA
 *
 * Lab 3
 *
 * Purpose: Creates a Linked List object that is able to add, remove, and find/get elements of type currency.
 * The Linked List uses nodes of type LinkNode to set the head and the tail of the node along with the other nodes.
 *
 */
public class SinglyLinkedList {

    protected int count;
    protected LinkNode start;

    protected LinkNode end;

    public SinglyLinkedList() {
        this.count = 0;
        this.start = null;
        this.end = null;
    }

    public SinglyLinkedList(LinkNode start, LinkNode end) {
        this.count = 0;
        this.start = start;
        this.end = end;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LinkNode getStart() {
        return start;
    }

    public void setStart(LinkNode start) {
        this.start = start;
    }

    public LinkNode getEnd() {
        return end;
    }

    public void setEnd(LinkNode end) {
        this.end = end;
    }

    public void addCurrency(Currency currency, int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException("Index is out of bounds.");
        }

        LinkNode node = new LinkNode(currency);

        if (index == 0) {
            node.setNext(start);
            start = node;
            if (count == 0) {
                end = node;
            }
        }else if (index == count) {
            end.setNext(node);
            end = node;
        }else {
            LinkNode previousNode = getNodeIndex(index - 1);
            node.setNext(previousNode.getNext());
            previousNode.setNext(node);
        }

        count++;
    }

    public Currency removeCurrency(Currency currency) {
        // Checks if list is empty, if it is then there are no nodes to remove
        if (count == 0) {
            return null;
        }

        // Previous node and the current node; previous is set to null and node to the start of the list
        LinkNode previous = null;
        LinkNode node = start;

        // while loop iterates through linked list until variable node becomes null thus reaching the end
        while (node != null) {
            // Checks if our node variable is equal to the currency we passed as a parameter
            if (node.getData().isEqual(currency)) {
                // if the previous node is null, we se the next node to the start/head of the list
                // if the list only has 1 node (count == 1) we set the end of the list as null since it become empty
                if (previous == null) {
                    start = node.getNext();
                    if (count == 1) {
                        end = null;
                    }
                    // if previous node is not null, previous is set to the node next of the current node
                    // if the node is equal to the end of the list we set the end to the previous node
                } else {
                    previous.setNext(node.getNext());
                    if (node == end) {
                        end = previous;
                    }
                }

                // count of the list decrements and we return the currency we removed
                count--;
                return node.getData();
            }

            //
            previous = node;
            node = node.getNext();
        }

        // if the currency is not found it returns null
        return null;
    }

    public Currency removeCurrency(int index) {
        // if index is less than 0 or greater than the list's size it throws an exception
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index is not valid");
        }

        // if the index is 0, it starts and the start of the list

        if (index == 0) {
            // currency object is taken from the start of the list (start.getData())
            // start now equals to the next node, (the node next to the first list element)
            // count decrements
            // If the count is 0 then the list is empty thus making the end of the list null
            // we then return currency object
            Currency currency = start.getData();
            start = start.getNext();
            count--;
            if (count == 0) {
                end = null;
            }
            return currency;
        }

        // Previous node object with index - 1 and the current node object using previous.getNext()
        LinkNode previous = getNodeIndex(index - 1);
        LinkNode node = previous.getNext();

        // previous node is set to the node next to the currenct node
        // count of list decrements
        // if the current node is the last node, then the end is set to the previous node
        // currency object is returned
        previous.setNext(node.getNext());
        count--;
        if (node == end) {
            end = previous;
        }
        return node.getData();

    }

    public LinkNode findCurrency(Currency currency) {
    	LinkNode findNode = start;
    	//System.out.println(findNode.getData());
    	while(findNode != null) {
    		System.out.println(findNode.getData());
    		if (findNode.getData().isEqual(currency)) {
    			return findNode;
    		}else {
    			findNode = findNode.getNext();
    		}
    	}
        return null;
    }

    public Currency getCurrency(int index) {
    	/*
    	 * loop index times
    	 * return node once the loop ends
    	 */
    	
    	LinkNode curNode = start;
    	
    	for (int i = 0; i < index; i++) {
    		curNode = curNode.getNext();
    	}
        return curNode.getData();
    }

    public String printList() {
    	/*
    	 * loop count times
    	 * keep on getting the next and its data
    	 * print out the data each time
    	 */
    	LinkNode curNode = start;
    	String resList = "";
    	
    	for (int i = 0; i < count; i++) {
    		
    		resList += (curNode.getData() + "	");
    		curNode = curNode.getNext();
    		
    	}
    	
        return resList;
    }

    public boolean isListEmpty() {
        return start == null;
    }

    public int countCurrency() {
        return count;
    }

    private LinkNode getNodeIndex(int index) {

        // node set to start of the list
        LinkNode node = start;

        // current index set to default zero
        int currIndex = 0;

        // while the current index is less than the parameter index the loop iterates
        // node is set to the next node in the list and the currentindex increases
        // if the node is equal to null then the exception is thrown
        // node is returned
        while (currIndex < index) {
            node = node.getNext();
            currIndex++;

            if (node == null) {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
        }
        return node;
    }

}

