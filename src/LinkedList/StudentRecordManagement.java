package LinkedList;

class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class StudentRecordManagement {
    public static void printList(Node head) {
        if (head == null) {
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static Node insertAtHead(Node head, int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return head;
        }

        n.next = head;
        head = n;

        return head;
    }

    public static Node insertAtTail(Node head, int val) {
        if (head == null) {
            head = insertAtHead(head, val);
            return head;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(val);

        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtHead(head, 1);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 3);

        head = insertAtTail(head, 4);

        printList(head);
    }
}
