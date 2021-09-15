package VTU_Questions;

public class LinkedList
{
    static class Node          // This inner class is made static so that main() can access it.
    {
        int data;
        Node next;

        Node(int d)            //Constructor for node.
        {
            data = d;
            next = null;
        }
    }
    static Node head;        // Creating Head of list. //Note: we should not make it static or else everyone can get access to head.
                             // Note: Head does not contain any data, it only contains address of first node. //watch neso academy java reference video to know how reference works.

    public static LinkedList insert(LinkedList list, int data)          //Insert at last node.
    //     v           v        v        v      v          v  //
    //modifiers - return_type method(data_type arg1, --- arg2)//
    {
        Node new_node = new Node(data);       // Create a new node with given data.
        //new_node.next = null;               // No need to write this statement as its default value by constructor is already null.
        //System.out.println(head.data);      // Error: Cannot read field "data" because "LinkedList.head" is null.

        if (list.head == null)                // If the Linked List is empty, then make the new node as head.
        {
            list.head = new_node;             // head node will point towards new_nodes data members. or we can say it contain address of new_node data members. or
                                              //head.data and head.next points towards new_node.data and new_node.next
        }
        else
        {
            Node temp = list.head;            // Else traverse till the last node and insert the new_node there.
            while (temp.next != null)         //see hackerrank linked list video which tells first new node will point towards head then head will points toward new node, else we can lose address of head.
            {
                temp = temp.next;             //Note temp.next is also a node not address because data_type of next is node.
            }
            temp.next = new_node;             // Insert the new_node at last node. // or we can say temp is pointing towards temp.next which contains new_node information.
        }
        return list;                          // Return the list by head.
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");

        while (currNode != null)                    // Traverse through the LinkedList.
        {
            System.out.print(currNode.data + " ");  // Print the data at current node.
            currNode = currNode.next;               // Go to next node.
        }
    }

    public static LinkedList deleteByKey(LinkedList list, int key)  // Method to delete a node in the LinkedList by KEY
    {
        Node currNode = list.head;                                  // Store head node
        Node prev = null;
        if (currNode != null && currNode.data == key)               // CASE 1: If head node itself holds the key to be deleted
        {
            list.head = currNode.next;                              // Changed head
            System.out.println("Element: "+key + " found and deleted");         // Display the message
            return list;                                            // Return the updated List
        }
        while (currNode != null && currNode.data != key)         // CASE 2: If the key is somewhere other than at head
        {
            prev = currNode;                                     // Search for the key to be deleted,// keep track of the previous node// as it is needed to change currNode.next
            currNode = currNode.next;                            // If currNode does not hold key // continue to next node
        }
        if (currNode != null)                                    // If the key was present, it should be at currNode. // Therefore the currNode shall not be null
        {
            prev.next = currNode.next;                           // Since the key is at currNode. // Unlink currNode from linked list
            System.out.println("Element: "+key + " found and deleted");      // Display the message
        }
        if (currNode == null)                                    // CASE 3: The key is not present. // If key was not present in linked list. // currNode should be null
        {
            System.out.println("Element: "+key + " not found");              // Display the message
        }
        return list;
    }

    public static LinkedList deleteAtPosition(LinkedList list, int index)     // Method to delete a node in the LinkedList by POSITION
    {
        Node currNode = list.head;
        Node prev = null;
        if (index == 1 && currNode != null)                                   // CASE 1: If index is 1, then head node itself is to be deleted
        {
            System.out.println(index + " position element deleted - Element: "+head.data);
            list.head = currNode.next;                                        // Changed head  // Display the message
            //printList(list);
            //System.out.println("");
            return list;                                                      // Return the updated List
        }
        int counter = 1;                               // CASE 2: If the index is greater than 1 but less than the size of LinkedList
        while (currNode != null)                       // Count for the index to be deleted,// keep track of the previous node// as it is needed to change currNode.next
        {
            if (counter == index)
            {
                System.out.println(index + " position element deleted - Element: "+prev.next.data);
                prev.next = currNode.next;             // Since the currNode is the required // position Unlink currNode from linked list
                //printList(list);
                //System.out.println("");
                break;
            }
            else
            {
                prev = currNode;
                currNode = currNode.next;              // If current position is not the index  // continue to next node
                counter++;
            }
        }
        if (currNode == null)                                                         // If the position element was found, it should be at currNode Therefore the currNode shall not be null
        {
            System.out.println(index + " position element not found");                // CASE 3: The index is greater than the size of the LinkedList // In this case, the currNode should be null
        }
        return list;
    }

    public static void main(String[] args)
    {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Linked List");
        System.out.println("-----------------------------------------------------------------------------------------");

        LinkedList list = new LinkedList();

        list = insert(list, 1);  //Its gives the list with data to insert method to modify it then save it to list.
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 9);
        list = insert(list, 10);

        printList(list);
        System.out.println("");

        deleteAtPosition(list, 1);
        deleteAtPosition(list, 5);
        deleteAtPosition(list, 10);

        System.out.println("-----------------------------------------------------------------------------------------");

        deleteByKey(list, 1);
        deleteByKey(list, 5);
        deleteByKey(list, 10);

        printList(list);
        System.out.println("");

        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}