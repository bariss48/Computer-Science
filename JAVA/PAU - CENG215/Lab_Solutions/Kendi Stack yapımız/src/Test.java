
public class Test {
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
        
        for (int i = 0; i < 10; i++) {
            
            stack.push(i);
            
        }
        
       
        stack.push(100);
        stack.pop();
        stack.push(101);
        stack.pop();
        stack.push(102);
        
        while(stack.isEmpty() == false){
            
            System.out.print(stack.pop()+" ");
            
            
        }
     
    }
}
