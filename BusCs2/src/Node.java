package buscs2;

public class Node {

    Bus data;
    Node next;

    public Node() {
        data = new Bus();
        next = null;
    }

    public Node(Bus data) {
        this.data = data;
        this.next = null;
    }

    public void display() {
        System.out.println(data);
    }
}