
/**
 *
 * @author tee
 */
public class palindrom {

   
    public static void main(String[] args) {
       
        
       System.out.print( isPalindrome("123321") );
       System.out.println();
       System.out.print( isPalindrome("kabak") );
       System.out.println();
       System.out.print( isPalindrome("11111") );
         
        
        
        
        
        
    }
    
    
    
    public static boolean isPalindrome(String str){
        
     
       String kelime="";
       
       for(int i=0;i<=str.length()-1;i++){
            
          
          kelime = kelime += str.charAt(i);
              
               
           }
          
       if(str.equals(kelime)){
           return true;
       }else{
           
       return false;
    }
    
    
   
    }
}
