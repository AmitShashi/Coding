package New_Questions;
public class DLL
{
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int d)               //Constructor
        {
            data = d;             // next and prev is by default initialized as null
        }
    }
    Node head; // head of list
    public void InsertFront(int new_data)             // Adding a node at the front of the list
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;                  // Make next of new node as head and previous as NULL
        new_Node.prev = null;

        if (head != null)
        {
            head.prev = new_Node;              // change prev of head node to new node
        }
        head = new_Node;                       // move the head to point to the new node
    }

    public void InsertAfter(Node prev_Node, int new_data)           // Given a node as prev_node, insert a new node after the given node
    {
        if (prev_Node == null)                                      // check if the given prev_node is NULL
        {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node new_node = new Node(new_data);                         // allocate node put in the data
        new_node.next = prev_Node.next;                             // Make next of new node as next of prev_node
        prev_Node.next = new_node;                                  // Make the next of prev_node as new_node
        new_node.prev = prev_Node;                                  // Make prev_node as previous of new_node

        if (new_node.next != null)                                  // Change previous of new_node's next node
        {
            new_node.next.prev = new_node;
        }
    }
    void InsertLast(int new_data)                                       // Add a node at the end of the list
    {
        Node new_node = new Node(new_data);
        Node last = head;                                           // used in step 5
        new_node.next = null;                                       // This new node is going to be the last node, so make next of it as NULL
        if (head == null)                                           // If the Linked List is empty, then make the new node as head
        {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null)                                   // Else traverse till the last node
        {
            last = last.next;
        }
        last.next = new_node;                                       // Change the next of last node
        new_node.prev = last;                                       // Make last node as previous of new node
    }
    public void printlist(Node node)                                // This function prints contents of linked list starting from the given node
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null)
        {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null)
        {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    public static void main(String[] args)                         // Driver program to test above functions
    {
        DLL dll = new DLL();                                       // Start with the empty list

        dll.InsertLast(6);                                             // Insert 6. So linked list becomes 6->NULL
        dll.InsertFront(7);                                       // Insert 7 at the beginning. So linked list becomes 7->6->NULL
        dll.InsertFront(1);                                       // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL
        dll.InsertLast(4);                                             // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL
        dll.InsertAfter(dll.head.next, 8);                 // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL

        System.out.println("Created New_Questions.DLL is: ");
        dll.printlist(dll.head);
    }
}