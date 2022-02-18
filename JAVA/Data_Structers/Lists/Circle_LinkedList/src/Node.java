/**
 *
 * @author Baris Kara // 12.10.2021
 * @param <E>
 */
public class Node <E>{
    
    Node<E> next;
    E value;
    
    public Node(E value,Node<E> next){    
        this.value = value;
        this.next = next;    
    }
          
}
