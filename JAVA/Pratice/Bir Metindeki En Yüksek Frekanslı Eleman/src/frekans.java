
import java.util.Scanner;


/**
 *
 * @author ßæ®ı$
 * 
 */
public class frekans {

   
    public static void main(String[] args) {
        
   
        //count("BERRRRRKKKKKKBARISSSSSSS");
        // en çok tekrar eden harfin sayısı
       System.out.println(en_çok_tekrar_edeni_bul("YILMAZKARA"));
        
         
     } 
      
    
    
    
    
      public static int[] count(String str){
        
       int [] göster = new int[str.length()];    
       char[] dizim = new char[str.length()]; 
       char[] yakala = new char[str.length()];
       
       
       dizim = str.toCharArray();
           
        int sayac=0;
        
        for(int i=0;i<dizim.length;i++){
            
            for(int j=0;j<dizim.length;j++){
                
            
            if(dizim[i] == dizim[j]){
                
                sayac++;
                göster[i]=sayac;
                yakala[i]=dizim[i];
               
            }     
                        
            }
         
            sayac=0;
            
        }
        
    
        
        
        
        return göster;
    }
    
    
    
    public static int en_çok_tekrar_edeni_bul(String str){
        
       int [] tut = new int[100];
       
       tut = count(str).clone();
        
       int temp=0;
       
        for (int i=1; i<tut.length; i++){
    
        for(int j=0; j<tut.length-i; j++){
        
            if (tut[j] > tut [j+1]){
            
                temp = tut [j];
                tut[j] = tut [j+1];
                tut [j+1] = temp;
            }  
                
        }
        }
       
       
       
       return tut[tut.length-1]; 
       
}
    
   public static void yazdır(int dizi[],int dizim[]){
       
       
       
       
       
       
       
       
   } 
    
    
    
}    
        
        
       
    
    

