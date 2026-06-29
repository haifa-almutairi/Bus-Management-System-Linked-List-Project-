package buscs2;

public class LinkedList {

    Node head;

    public LinkedList() {
        head = new Node();
    }

    public void addData(Bus data) {
        Node temp = new Node(data);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = temp;
    }

    public void DeleteNode(String code) {

        Node current = head.next;
        Node previous = head;

        while (current != null) {

            if (current.data.getCode().equals(code)) {
                previous.next = current.next;
                return;
            }

            previous = current;
            current = current.next;
        }
    }

    public void Display() {

        Node current = head.next;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}