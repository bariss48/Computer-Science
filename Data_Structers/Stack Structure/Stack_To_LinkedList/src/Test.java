/**
 *
 * @author Baris 15.10.2021
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Stack_To_List stack = new Stack_To_List();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        System.out.println(stack);       
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack);        
    
    }
    
}
