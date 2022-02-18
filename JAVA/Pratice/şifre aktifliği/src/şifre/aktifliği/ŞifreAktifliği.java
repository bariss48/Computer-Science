/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package şifre.aktifliği;

import java.util.Scanner;

/**
 *
 * @author tee
 */
public class ŞifreAktifliği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char dizim[] =new char[6];
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("Almak istediğiniz şifrenin uygunluğunu kontrol ediniz:");
        String tut =input.nextLine();
        dizim = tut.toCharArray();
        şifre_kontrol(dizim);
        // TODO code application logic here
    }
    
    public static void şifre_kontrol(/*string yaparsak olmuyor*/ char[] dizi){
        
      
        
        String alfabe = "abcdefghjklmnoöprstuüzxvçqwyıiğp";
        String sayılar ="1234567890";
        String karakter ="!'^%&/()=?*-.";
      
        char[] karşılaştır = new char[31];
        char[] check = new char[9];
        char[] bak = new char[10];
       // dizi = kelime.toCharArray();
       
       karşılaştır = alfabe.toCharArray();
       check = sayılar.toCharArray();
       bak = karakter.toCharArray();
        
        if(dizi.length == 7){
        //   int sayac =0;
        //   int sayac_iki=0;
        //   int sayac_uc=0;
            int sayac_Dort=0;
            int sayac_bes=0;
            int sayac_altı=0;
            int sayac_yedi=0;
            
            for(int i=0;i<dizi.length;i++){
            for(int j=0;j<karşılaştır.length;j++){
                   
            if(dizi[i] == karşılaştır[j]){
                
                sayac_bes++;
                
               } 
                
            }
            }
            for(int i=0;i<dizi.length;i++){
            for(int j=0;j<check.length;j++){
                
                if(dizi[i] == check[j]){
                
                sayac_altı++;
                
               } 
             
            }
            }
            for(int k=0;k<dizi.length;k++){
            for(int j=0;j<bak.length;j++){
                
                if(dizi[k] == bak[j]){
                    
                    sayac_yedi++;
                }
            
                
            }    
             
            }
            
        if(sayac_bes >= 1 && sayac_altı >= 1 && sayac_yedi ==0){
            
            
            System.out.println("Geçerli bir şifre oluşturdunuz..");
            
        }else{
            System.out.println("Geçersiz bir şifre oluşturdunuz!!!");
        }    
            
            
        /*    for(int i=0;i<32;i++){
           
            for(int j=0;j<32;j++){    
               try{ 
                   
               if(dizi[i] != bak[j]){
                   
                   sayac++;
                   
               if(dizi[i] == karşılaştır[j] && dizi[i] == check[j] && sayac_Dort == 0){
                   
                       sayac_Dort++;
                     
               }
                   
        }else{
              sayac_iki++;    
              }
        }
        catch(ArrayIndexOutOfBoundsException e){    
        }
        }
               
   
        }
           
         if(sayac_iki == 0 && sayac_Dort ==1){
             
             System.out.println("Geçerli Şifre");
             
         }else{
             
             System.out.println("Geçersiz Şifre!!!");
         }   
         
        }else{
            System.out.println("7 karakterli olmalıdır şifreniz!!!");
        }
      */
            
}else{
           System.out.println("Şifreniz 7 karakterli olmadılır!!!"); 
            
        }
        
   
}
}
