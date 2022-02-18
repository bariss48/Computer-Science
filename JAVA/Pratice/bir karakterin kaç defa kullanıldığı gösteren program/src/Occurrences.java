
import java.util.Scanner;


/**
 *
 * @author ßæ®ı$
 * 
 */
public class Occurrences {

   
    public static void main(String[] args) {
        
      
      System.out.println( count("YILMAZ KARA",'K') );
      
      
    }
    
    public static int count(String str,char a){
        
           
       char[] dizim = new char[str.length()]; 
        
       dizim = str.toCharArray();
        
        char tut = a;
        int sayac=0;
        
        
        for(int i=0;i<dizim.length;i++){
            
            if(dizim[i] == tut){
                
                sayac++;
            }
         
            
            
        }
        
        
        return sayac;
    }
    
}
