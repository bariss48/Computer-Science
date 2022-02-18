import java.util.LinkedList;

public class Traversal_Tree {

        public static void main(String[] args) {
            Node tree = new Node(10);
            
            tree.insert(12);
            tree.insert(34);
            tree.insert(21);
            tree.insert(41);
            tree.insert(65);
            tree.insert(23);
            tree.insert(67);
            tree.insert(32);
            tree.insert(90);
            tree.insert(75);
            tree.insert(3);
            tree.insert(7);

            System.out.println("Pre order traversal:");
            tree.printPreOrder();
            System.out.println();
            System.out.println("In order traversal:");
            tree.printInOrder();
            System.out.println();
            System.out.println("Post order traversal:");
            tree.printPostOrder();
            System.out.println();           
        }
    }

    /**
     * printInOrder: Left side of TREE -> Root -> Right side of TREE
     * printPreOrder: Root -> Left side of TREE -> Right side of TREE
     * printPostOrder: Left side of TREE -> Right side of TREE -> Root
     * printLevelOrder: Prints by level (starting at root), from left to right.
     */
    class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public void insert(int value) {
            if (value < data) {
                if (left == null) {
                    left = new Node(value); // and when find to NULL left branch mean you can add a new Node()
                } else {
                    left.insert(value); // let's go to deep Node and create left one recursive()
                }
            } else {
                if (right == null) {        // same for insert left()
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public void printInOrder() {
            if (left != null) {
                left.printInOrder(); // let's go to deep most left node 
            }
            System.out.print(data + " "); // and print to value it's now firstly print left
            if (right != null) {
                right.printInOrder();   // after print left side , print a ROOT and last one right side
            }
        }

        public void printPreOrder() {
            System.out.print(data + " "); // let's print to ROOT Node firstly 
            if (left != null) {
                left.printPreOrder(); // let's go to deep most left node and print to value it's now firstly print left
            }
            if (right != null) {
                right.printPreOrder(); // after print left side , print a ROOT and last one right side
            }
        }

        public void printPostOrder() {
            if (left != null) {
                left.printPostOrder();
            }
            if (right != null) {
                right.printPostOrder();
            }
            System.out.print(data + " "); // start with print right side and ROOT last one LEFT side
        }
 
     /*
        public void printLevelOrder() {
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(this);
            while (queue.size() > 0) {
                Node head = queue.remove();
                System.out.print(head.data + " ");
                if (head.left != null) {
                    queue.add(head.left);
                }
                if (head.right != null) {
                    queue.add(head.right);
                }
            }
        }
        */
    }

