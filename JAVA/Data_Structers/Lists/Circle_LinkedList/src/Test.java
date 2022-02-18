/**
 *
 * @author Baris
 */
public class Test{

    /**
     * @param args the command line arguments
     * @param <E>
     */
    public static void main (String[] args) {

       CircleLinkedList list = new CircleLinkedList();
            
       Node kutu = new Node(3, null);
       Node kutu1 = new Node(5, null);
       Node kutu2 = new Node(6, null);
       Node kutu3 = new Node(2, null);
       Node kutu4 = new Node(1, null);
       Node kutu5 = new Node(10, null);
       Node kutu6 = new Node(10, null);
       
       
       list.addLast(kutu);
       list.addLast(kutu1);
       list.addLast(kutu2);
       list.addLast(kutu3);
       list.addLast(kutu4);
       list.addLast(kutu5);
       list.print();
       System.out.println();              
       list.remove(2);    
       list.print();
      // list.addLast(kutu6);
    }
    
}
