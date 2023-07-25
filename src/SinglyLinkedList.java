import org.w3c.dom.Node;

public class SinglyLinkedList {

    private int count;
    private LinkNode start;

    private LinkNode end;

    public SinglyLinkedList(int count, LinkNode start, LinkNode end) {
        this.count = count;
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

    public void addCurrency(Currency currency, LinkNode index) {

    }

    public void removeCurrency(Currency currency) {

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

}

