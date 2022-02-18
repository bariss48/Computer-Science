/**
 *
 * @author Baris Kara // 12.10.2021
 * @param <E>
 */
public class CircleLinkedList<E>{
    
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public CircleLinkedList() {
        size = 0;
    }
    
     public int getSize() {
        return size;
    }
     
     public void addLast(E element){
               
         if(getSize() == 0 && element != null){                          
             head = new Node<E>(element,null);      
             tail = head;
             size++;
         }else{
             tail.next = new Node<E>(element,head);
             tail = tail.next;
             size++;  
         }
                             
      }
     
     public E remove(int pos) {
        if (pos > size || pos < 0) {
            throw new IndexOutOfBoundsException("please possible digits!");
        }
        Node<E> previous = head;
        for (int i = 1; i < pos; i++) {
            previous = previous.next;
        }
        Node<E> delete = previous.next;
        E hold = delete.value;
        previous.next = previous.next.next;
        delete = null;
        size--;
        return hold;
    }  
     
     public void print(){
     
        Node<E> gezen_kutu = head;
        System.out.print(gezen_kutu.value);
        gezen_kutu = gezen_kutu.next;
        while(gezen_kutu != head){
             System.out.print("--->"+gezen_kutu.value);
             gezen_kutu = gezen_kutu.next;
        }
     
     }
     
     }
    
   

