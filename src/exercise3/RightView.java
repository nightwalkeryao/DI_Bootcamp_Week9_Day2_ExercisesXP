package exercise3;

public class RightView {

    public static void printRightView(Node root) {
        traverse(root, 1, new int[] { 0 });
    }

    public static void traverse(Node node, int level, int[] maxLevel) {
        if (node == null) {
            return;
        }
        if (level > maxLevel[0]) {
            System.out.print(node.val + " ");
            maxLevel[0] = level;
        }
        traverse(node.right, level + 1, maxLevel);
        traverse(node.left, level + 1, maxLevel);
    }

    public static void main(String[] args) {
        // Exemple 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        root1.right.right.right = new Node(8);

        System.out.print("Right view of tree 1 is: ");
        printRightView(root1);

        // Exemple 2
        Node root2 = new Node(1);
        root2.left = new Node(8);
        root2.left.left = new Node(7);

        System.out.print("\nRight view of tree 2 is: ");
        printRightView(root2);
    }
}
