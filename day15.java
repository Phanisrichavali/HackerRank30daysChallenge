import java.util.Scanner;
class Node {
    int data, count;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;    
    }
    Node insert(Node head, int data) {
        Node element = new Node(data);
        Node currentPointer = head;
        while(currentPointer.getNext() != null) {
            currentPointer = currentPointer.getNext();
        }
        currentPointer.setNext(element);
        return head;
    }
    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
public class Solution {
   public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        int data = scanner.nextInt();
        Node head = new Node(data);
        for (int index = 0; index < T - 1; index++) {
            data = scanner.nextInt();
            head = head.insert(head, data);
        }
          if (head.getNext() == null) {
            System.out.println(head.getData());
        } else {
            while (head.getNext() != null) {
                System.out.print(head.getData() + " ");
                head = head.getNext();
            }
            System.out.print(head.getData());
        }
    }
}
