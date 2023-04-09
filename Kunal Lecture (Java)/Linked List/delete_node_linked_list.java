import java.util.Scanner;

class Node
{
    int data;
    Node next;                  // To store the reference the next node.

    Node (int data)           // Constructor
    {
        this.data = data;
        next = null;        // Default value of any reference in an any object is null.
    }
}

public class delete_node_linked_list
{

    public static Node takeInput()
    {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        while (true)
        {
            int data = sc.nextInt();
            if (data == -1)
            {
                break;
            }

            Node currentNode = new Node(data);

            if (head == null)
            {
                head = currentNode;
                tail = currentNode;
            }

            else
            {
                tail.next = currentNode;
                tail = currentNode;    // tail = tail.next;
            }
        }
        return head;
    }

    public static Node delete(Node head , int position)
    {
        if (head == null)
        {
            return head;
        }
        if (position == 0)
        {
            return head.next;
        }

        int count = 0;
        Node current_node = head;

        while(current_node != null && count < (position - 1))
        {
            current_node = current_node.next;
            count++;
        }

        if (current_node == null || current_node.next == null)
        {
            return head;
        }

        current_node.next = current_node.next.next;

        return head;
    }

    public static void print(Node head)

    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the linked list : ");
        Node head = takeInput();

        System.out.println("Enter the element and position where we have to delete : ");
        int position = sc.nextInt();

        head = delete(head , position);
        System.out.println("After deleting in linked list : ");

        print(head);
    }
}
