
package summingıntegers;

import java.util.Scanner;

/**
 *
 * @author tee
 */
public class SummingIntegers {

   
    public static void main(String[] args) {
      
        
       System.out.println("Giriniz: ");
       Scanner input = new Scanner(System.in); 
       
       String sayılar= "0123456789 ";
       
       String tut = input.nextLine();
       
       int sum=0;
       try{
       
       char [] kaydet = new char[30];
       char [] save = new char[sayılar.length()];
       int[] göster = new int[30]; 
       
       kaydet=tut.toCharArray();
       save = sayılar.toCharArray();
        
        char topla = ' ';
       
        for (int i = 0; i < save.length-1; i++) {
          
            
            if(kaydet[i] == save[i]){
                
               topla = kaydet[i];
                
            }
           
        if(topla == '1'){
            sum +=1;
        }else if(topla == '2'){
            sum +=2;
        }else if(topla == '3'){
            sum+=3;
       }else if(topla == '4'){
           sum+=4;
       }else if(topla == '5'){
           sum+=5;
       }else if(topla == '6'){
           sum+=6;
       }else if(topla == '7'){
           sum+=7;
       }else if(topla == '8'){
           sum+=8;
       }else if(topla == '9'){
           sum+=9;
       }
            
        }
        
      
        
       }catch(ArrayIndexOutOfBoundsException e){
           
       }
       
        System.out.println(sum);
        
        
        
        
    }
    
}
