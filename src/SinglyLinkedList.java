import org.w3c.dom.Node;
import org.w3c.dom.css.CSSImportRule;

public class SinglyLinkedList {

    private int count;
    private LinkNode start;

    private LinkNode end;

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
        return null;

    }

    public void removeCurrency(LinkNode index) {}

    public LinkNode findCurrency(Currency currency) {
        return null;
    }

    public Currency getCurrency(LinkNode index) {
        return null;
    }

    public String printList() {
        return "";
    }

    public boolean isListEmpty() {
        return false;
    }

    public int countCurrency() {
        return 1;
    }

    private LinkNode getNodeIndex(int index) {
        LinkNode node = start;

        int currIndex = 0;

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

