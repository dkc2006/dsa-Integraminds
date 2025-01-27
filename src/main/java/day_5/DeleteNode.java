package day_5;

public class DeleteNode {

    // Method to delete a node with a given value (x) from the linked list
    Node deleteNode(int x, Node head) {
        // If the list is empty, return the current head (null)
        if (head == null) {
            return head;
        }

        // If the head node contains the value to be deleted
        if (head.data == x) {
            head = head.next; // Move the head to the next node
            return head;
        }

        // Traverse the list to find the node with the value x
        Node temp = head;
        while (temp.next != null && temp.next.data != x) {
            temp = temp.next;
        }

        // If the node with the value x is found, remove it
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head; // Return the updated head
    }

    // Method to display the linked list
    void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNode list = new DeleteNode();

        // Creating a sample linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original List:");
        list.display(head);

        // Deleting a node
        head = list.deleteNode(20, head);
        System.out.println("\nAfter deleting 20:");
        list.display(head);

        // Deleting the head node
        head = list.deleteNode(10, head);
        System.out.println("\nAfter deleting 10 (head):");
        list.display(head);

        // Deleting a node not present in the list
        head = list.deleteNode(50, head);
        System.out.println("\nAfter trying to delete 50 (not in list):");
        list.display(head);
    }
}
