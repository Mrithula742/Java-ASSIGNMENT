import java.util.Scanner;
public class DeleteLinkedList 
{
    static class Node
     {
        int data;
        Node next;
        Node(int data) 
        {
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
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void delete(int key) 
    {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) 
        {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) 
        {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }
        prev.next = temp.next;
    }
    void display() {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        DeleteLinkedList list = new DeleteLinkedList();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            list.insert(sc.nextInt());
        }
        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();
        list.delete(key);
        System.out.println("After Deletion:");
        list.display();
    }
}