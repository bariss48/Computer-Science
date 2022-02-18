/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskambil;

import java.util.Random;

/**
 *
 * @author barış
 */
public class Iskambil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random rastgele = new Random();
        int deck[] = new int[52];
        String tip[] = {"Kupa","Maça","Sinek","Karo"};
        String kartlar[] = {"As","2","3","4","5","6","7","8","9","10","Joker","Kraliçe","King"};
        
        
        for(int i=0;i<deck.length;i++){
            
            deck[i]= i;
            
        }
        for(int i =0;i<deck.length;i++){
            
            int sıra = (int)(Math.random() * deck.length);
            int tut = deck[i];
            deck[i] = deck[sıra];
            deck[sıra] = tut;
            
        }
        
        
        for(int k=0;k<4;k++){
            
        String çeşit = tip[deck[k] / 13];    
        String kart  = kartlar[deck[k]%13];
        System.out.println("Kartınız:"+deck[k]+"---"+çeşit+" "+kart);
            
            
        }
        
        
        
        
    }
    
}
