package exercise1;

public class LinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public int countInt(int key) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public int countIntRecursive(int key) {
        return countIntRecursive(head, key, 0);
    }

    private int countIntRecursive(Node node, int key, int frequency) {
        if (node == null) {
            return frequency;
        }
        if (node.data == key) {
            frequency++;
        }
        return countIntRecursive(node.next, key, frequency);
    }

    public void printKeyAndResult(int key) {
        System.out.println("1iere Methode");
        System.out.println("Clé : " + key);
        System.out.println("Nombre d'occurrences : " + countInt(key));
        System.out.println("");
        System.out.println("2ieme Methodes");
        System.out.println("Clé :" + key);
        System.out.println("Nombre d'occurrences : " + countIntRecursive(key));
    }
}
