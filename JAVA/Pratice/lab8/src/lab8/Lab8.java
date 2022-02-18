
package lab8;


   public class Lab8 {
    public static <T> BTNode<T> solaDondur(BTNode<T> k1){
        
        BTNode<T> k2;
        BTNode<T>  y;
        
        k2 = k1.right;
        
        y = k2.left;
        
        k1 = k2.left;
        
        k1.right = y;
        
        return k2;
    }
    public static <T> BTNode<T> sagaDondur(BTNode<T> k2){
        
        BTNode<T> k1;
        BTNode<T>  a;
        
        
        k1 = k2.left;
        
        a =k1.right;
        
        k1.right = k2;
               
        
        k2.left = a;
        
       
        return k1;
       
    }
    public static <T> BTNode<T> solaSagaDondur(BTNode<T> k3){
       k3.left = solaDondur(k3.left);
        
        return sagaDondur(k3);
    }
    public static <T> BTNode<T> sagaSolaDondur(BTNode<T> k1){
        return null;
    }
}

        




    
    

