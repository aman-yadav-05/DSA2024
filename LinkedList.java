class Node {
    int data;
    Node next;

    // creating constructors
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // creatig a constructor with null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// converiting array to LinkedList

public class LinkedList {
    public static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static int lengthLinkedList(Node head) {
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 1, 22, 65, 7 };
        // Node node2 = new Node(arr[0]);
        // Node z = new Node(arr[2], node2);
        // Node node3 = new Node(arr[4], z);
        // System.out.println(node3.data);

        Node head = convert(arr);
        System.out.println(lengthLinkedList(head));
        // System.out.println(head.data);

    }
}