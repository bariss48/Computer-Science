/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezir;

import java.util.ArrayList;

/**
 *
 * @author Barış
 */
public class Vezir {

   
    public static void main(String[] args) {
        
        
        ArrayList Satranc_tahtam = new ArrayList();
        
        
        String[][] tahta = new String[8][8];
        
      
        tahtayı_doldur(tahta);
     //  Satırı_bosalt(tahta);
        yazdır(tahta);
        
        
        
        
        
    }
    
    
    
    
    public static void tahtayı_doldur(String tahta [][]){
        
        for(int i=0;i<8;i++){
            
            for(int j=0;j<8;j++){
                
                
               tahta[i][j] = null; 
                
                
            }
            
            
        }
        
    }
    
    public static void Satırı_bosalt(String tahta[][]){
        
        
             tahta[0][3] = "Q";
        
            for(int i=0;i<8;i++){
                
            for(int j=0;j<8;j++){
                
              if(tahta[i][j] == null){
                  
                  
                  
                  
                  
              }
                       
                       
                       
                       
                   }
                   
                   
               
                
            }
                
                
                
                
                
            }
            
            
            
           
    
    public static void yazdır(String tahta[][]){
     
     int satir = 0;
     
     for(int i=0;i<8;i++){
            
            for(int j=0;j<8;j++){
                
                if(satir%8 ==0){
                    System.out.println();
                    
                }
              System.out.print(tahta[i][j]);
              satir++;  
    
}
     }
    }
}