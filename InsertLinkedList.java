import java.util.Scanner;
public class InsertLinkedList 
{
    static class Node 
    {
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
        if (head == null) {
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
    void display() 
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertLinkedList list = new InsertLinkedList();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter value: ");
            int val = sc.nextInt();
            list.insert(val);
        }
        System.out.println("Linked List:");
        list.display();
    }
}