package DataStructures.Lists;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Merge_K_SortedLinkedlist a = new Merge_K_SortedLinkedlist();

        Node kutu = new Node(20);
        Node kutu1 = new Node(30);
        Node kutu2 = new Node(40);
        Node kutu3 = new Node(50);
        Node kutu4 = new Node(60);
        Node kutu5 = new Node(70);
        Node kutu6 = new Node(80);
        Node kutu7 = new Node(90);
        Node kutu8 = new Node(10);

        Node[] linkedlists_array = new Node[10];
        Random rastgele = new Random();


        for (int i = 0; i < linkedlists_array.length-1 ; i++) {
            int temp = 0;
            temp = rastgele.nextInt(100);
            linkedlists_array[i] = new Node(temp);
        }

        System.out.println(a.mergeKList(linkedlists_array,1));


    }
}
