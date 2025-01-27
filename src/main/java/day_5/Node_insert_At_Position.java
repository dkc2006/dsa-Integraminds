package day_5;

class LinkedListNode { // Renamed to avoid conflicts
    int data;
    LinkedListNode next;

    LinkedListNode(int x) {
        data = x;
        next = null;
    }
}

public class Node_insert_At_Position {

    // Method to insert a node at a given position in the linked list
    LinkedListNode insert_At_Pos(int pos, int val, LinkedListNode head) { // T.C = O(pos)
        // 1. Create a new node
        LinkedListNode newNode = new LinkedListNode(val);

        // Special case: Insert at the head
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        // 2. Travel till pos-1
        LinkedListNode p = head;
        for (int i = 1; i < pos && p != null; i++) {
            p = p.next;
        }

        // If pos is out of bounds (e.g., p is null), insertion is not possible
        if (p == null) {
            System.out.println("Position is out of bounds.");
            return head;
        }

        // 3. Insert the new node
        newNode.next = p.next;
        p.next = newNode;

        return head;
    }

    // Method to display the linked list
    void display(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node_insert_At_Position list = new Node_insert_At_Position();

        // Creating a sample linked list
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);

        System.out.println("Original List:");
        list.display(head);

        // Insert at position 0 (beginning)
        head = list.insert_At_Pos(0, 5, head);
        System.out.println("\nAfter inserting 5 at position 0:");
        list.display(head);

        // Insert at position 2 (middle)
        head = list.insert_At_Pos(2, 15, head);
        System.out.println("\nAfter inserting 15 at position 2:");
        list.display(head);

        // Insert at position 5 (end)
        head = list.insert_At_Pos(5, 35, head);
        System.out.println("\nAfter inserting 35 at position 5:");
        list.display(head);

        // Trying to insert at an out-of-bounds position
        head = list.insert_At_Pos(10, 50, head);
    }
}
