/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tee
 */
public class Blackjack {

    
    public static void main(String[] args) {
        
       int deck[] = new int [52];
        
       diziyi_doldur(deck);
        int sayac=0;
      
       for(int i = 0; i<100;i++){
           
          if( blackjack_mi(deck) == true){
              
              sayac++;
          }
           
       }
       System.out.print(sayac+" "+"kez BLACKJACK yaptınız!!!"+"(Bilgi: 100 seferde)");
       
    }
    
    
    public static void diziyi_doldur(int dizi[]){
        
        
        for (int i = 0; i < dizi.length; i++) {
            if(i % 13 == 0){
                
                dizi[i] = 11;
                
            }else if(i % 13 >= 9){
                
                dizi[i] = 10;
            }else{
                dizi[i] = i%13;
                
            }
            
            
            
        }
        
    }
    
    public static boolean blackjack_mi(int dizi[]){
        
      Random rastgele = new Random(); 
       
      int toplam =0;
         
      for(int k=0;k<2;k++){
      
         int a = rastgele.nextInt(52);
         toplam += dizi[a];
      
      }
      if(toplam == 21){
           
        return true;
            
        }else
          
       return false;
     
    }
    
   
    
}
