
package Baris;

import static java.util.Collections.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



   
    public class  Baris<T extends Comparable<T>> extends AbstractLinkedList<T> {
       
         AbstractLinkedList list1 = new AbstractLinkedList(){
             
             
             
             @Override
             public void insertInOrder(Object value) {
              
               while(list1.head != null){
                   
         
                   
               }
                   
             }
             @Override
             public AbstractLinkedList reverse() {
                 
                 while(list1.head.value != null) 
                  
                 return;
             }

             @Override
             public AbstractLinkedList concatenate(AbstractLinkedList list) {
                 
             
                 return null;
                 
             }
         }
    }
        
   
    /**
     * Bir listede elemanları uygun konuma ekler. Boş bir listeye elemanlar eklendikten
     * sonra küçükten büyüğe sıralı olur
     * @param value eklenecek değer
     */
    
        
    
    /*public void insertInOrder(T value) {
        
        LinkedList<T> liste1 = new LinkedList<T>();
        LinkedList<T> liste2 = new LinkedList<T>();
       
          while (!liste2.isEmpty()) {
              
             for(T T: liste2){
                 
                 int karsilastirma = T.compareTo(value);
                  
                 if (karsilastirma == 0) {
                
                System.out.println("Listenizde bu eleman zaten var...");
                
                return;
               
            }
            else if (karsilastirma  < 0) {
                
           
            }
            else if (karsilastirma > 0 ) {
               
     
                liste2.add(value);
             
                return;
                
            }
              
             } 
               
     
    } 
          */
              
    /*  Node yardımcı(T value, Node<T> next){ 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
          
     */     
     
    /**
     * Mevcut listeyi değiştirmeden, elemanların sırası ters çevrilmiş halde geri döndürür.
     * @return Ters çevrilmiş liste
     */
    
    /*     AbstractLinkedList eleman = new AbstractLinkedList(){
             
             
             @Override
             public void insertInOrder(Object value) {
              
              
             }

             @Override
             public AbstractLinkedList reverse() {
                 
                
                 return null;
             }

             @Override
             public AbstractLinkedList concatenate(AbstractLinkedList list) {
                 
                 
                 
                 return null;
                 
             }
         };
        
        
        */
        
        
   /*   Node ilk = null;
      Node gecici = head;
      Node next = gecici.next;
      while(gecici != null){
      if(next == null)
         return;
      gecici.next = ilk;
      ilk = gecici;
      gecici = next;
      next = next.next;
     */
      
    /**
     * Mevcut liste ile parametre olarak gelen listeyi birleştirip geriye döndürür.
     * Mevcut listede değişiklik yapılmaz.
     * @param list Mevcut listenin sonuna eklenecek liste
     * @return Birleşmiş liste
     */
   
/*Node ilk = null; 
  Node simdiki = node; 
  Node next = null; 
  while (simdiki != null) { 
   next = simdiki.next; 
   simdiki.next = ilk; 
   ilk = simdiki; 
   simdiki = next; 
        } 
   node = ilk; 
   return node; 
    } 
*/