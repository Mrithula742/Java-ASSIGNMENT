import java.util.Scanner;

public class SearchLinkedList 
{
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    void insert(int data) 
    {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void search(int key)
    {
        Node temp = head;
        int position = 1;

        while (temp != null) 
        {
            if (temp.data == key) 
            {
                System.out.println("Element found at position: " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SearchLinkedList list = new SearchLinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
         {
            System.out.print("Enter value: ");
            list.insert(sc.nextInt());
        }
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        list.search(key);
    }
}