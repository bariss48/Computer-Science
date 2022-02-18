/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockerpuzzle;

/**
 *
 * @author barış
 */
public class Lockerpuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        boolean dizi[] = new boolean[101];
        
        
        
       // doldur(dizi);
       // bul(dizi);
       // yazdır(dizi);
        
         boolean[] lockers = new boolean[101];
        //Open all multiples of 1 before moving on to 2
        for (int i = 1; i < lockers.length; i++) {
            lockers[i] = true;
        }


        //open every locker for every multiple of i
       //open every locker for every multiple of i
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; i * j <= 100; j++) {
                lockers[i * j] = (lockers[i * j] == true) ? false : true;
            }
        }



        //Display the indices of the open lockers
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i] == true)
                System.out.println("locker " + i + " is open.");
        }
        
        
        
    }
    
    
    
    
    public static void doldur(boolean dizi[]){
        
        
        for (int i = 0; i < dizi.length; i++) {
           
                dizi[i] = false;
                
            
        }
        
        
        
    }
    
       public static void yazdır(boolean dizi[]){
        
        
        for (int i = 0; i < dizi.length; i++) {
           
             System.out.print(dizi[i]+" ");
                
            
        }
       }
    
    public static void bul(boolean dizi[]){
        
        
       dizi[0] = true;
        
        for(int i=3;i<101;i++){
            
         int sayac =3;   
         int temp = i;
         temp += sayac;   
         
             if(100%temp == 0){
                 
                 if(dizi[temp] == true){
                     
                     dizi[temp] = false;
                 }else if(dizi[temp] == false){
                     
                     dizi[temp] = true;
                 }
                 
             }
         
            sayac++;
        }
        
        
        
        
    }
    
}
