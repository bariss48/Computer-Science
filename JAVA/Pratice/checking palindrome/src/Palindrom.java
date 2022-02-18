
import java.util.Scanner;




public class Palindrom {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Palindrom olup olmadığına bakmak istediğiniz cümleyi giriniz:");
        String cümle = input.nextLine();
        
        if(isPalindrom(cümle)){
            
            System.out.println("Cümleniz Palindrom "+cümle);
        }else{
            System.out.println("Cümleniz Palindrom değil "+cümle);
        }
        
        
        
        
        
        
        
        
        
        
    }
    
    public static boolean isPalindrom(String cümle){
        
      int low = 0;
      int high = cümle.length()-1;
           
      while(low<high){
          
          if(cümle.charAt(low) != cümle.charAt(high)){
           
           return false;   
          }
       low++;
       high--;
          
      }
      return true;
        }
        
        
     
    }
    

