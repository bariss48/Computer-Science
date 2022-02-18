/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservesort;

/**
 *
 * @author tee
 */
public class ReserveSort {

    
    
    
    
    public static void main(String[] args) {
     
    terstensırala("program");    
    System.out.println();    
    terstensırala("java programming");
    System.out.println();
    terstensırala("HELLO JAVA");
    System.out.println();
    terstensırala("BARIŞ");    
        
        
    }
 
    
    
    public static void terstensırala(String str){
        
       int sayac =0;
       
       char temp=' ';
       char enbuyuk = ' ';
       
       char []çevir = new char[str.length()];
        
       char []sıralanmış = new char[str.length()];
        
        çevir = str.toCharArray();
       
        for(int i=0;i<str.length()-1;i++){
            
        for(int j=str.length()-1;j>i;j--){
          
            if(çevir[j] > çevir[j-1]){
                
             temp = çevir[j-1];
             çevir[j-1] = çevir[j];
             çevir[j] = temp;
           
             }
            
        } 
        
        
        }
        
         
     
       for(int p=0;p<sıralanmış.length;p++){
           
       System.out.print(çevir[p]);
           
       } 
       
        
        
        
    }
    
}
