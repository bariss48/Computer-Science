import java.util.Scanner;

/**
 *
 * 
            System.out.println("----- ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ");
            System.out.println("00-09  10-19  20-29  30-39  40-49  50-59  60-69  70-79  80-89  90-99   100 ");        
    
 * @author 08.10.2021 // ßÆ®İS
 */
public class pascal_triangle {
    
    public static void main(String[] args) {
        //its a double reserve pascal triangle with 90 degree to right
        int step = 0;
        Scanner input = new Scanner(System.in);
        String temp = " ";
        System.out.println("Prompt to step count your Pascal Triangle: ");
        step = input.nextInt();       
        for (int i = 1; i < step; i++) {
            temp = pascal(i);            
            System.out.println(" "+temp);            
        }
        for (int i = step; 0 < i; i--) {
            temp = pascal(i);            
            System.out.println(" "+temp);            
        }        
    }
    
    public static String  pascal(int step_count){
        String hold[] = new String[step_count];
        String pascal_string = "";
        String pascal_string_second = "";
        String Alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","Y","Z"};
        for (int i = 0; i < step_count; i++) {          
            hold[i] = Alphabet[i%22];          
        }
        for (int i = 0; i < hold.length; i++) {          
            String temp = "";
            pascal_string += hold[i%22];                   
        }     
         for (int j = hold.length-2; 0<=j; j--) {             
               pascal_string_second += hold[j]; 
           } 
        return(pascal_string + pascal_string_second);            
    }
    
}
