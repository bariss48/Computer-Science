
package bean.machine;

import java.util.Random;
import java.util.Scanner;


public class BeanMachine {
    
  
    public static void main(String[] args) {
        
          
        Random rastgele = new Random();
        Scanner input = new Scanner(System.in);     
        
       
        int dizi[] = new int [7];
        System.out.println("Kaç top atmak istersiniz: ?");
        int atılacak_top_sayısı = input.nextInt();
        
        
        for (double i =0; i<atılacak_top_sayısı; i++) {
            
            double tut = 3.5;
            
            if(topu_at(tut) <= 0.5){
                dizi[0] = dizi[0]+1;
            }else if(topu_at(tut) <= 1.5) {
                dizi[1] = dizi[1] + 1;
            }else if(topu_at(tut) <= 2.5){
                dizi[2] = dizi[2] + 1;
            }else if(topu_at(tut) <= 3.5){
                dizi[3] = dizi[3] + 1;
            }else if(topu_at(tut) <= 4.5){
                dizi[4] = dizi[4] + 1;
            }else if(topu_at(tut) <= 5.5){
                dizi[5] = dizi[5] + 1;
            }else if(topu_at(tut) <= 6.5){
                dizi[6] = dizi[6] + 1;
            }else if(topu_at(tut) <= 7.0){
                dizi[7] = dizi[7] + 1;
                
            }
            
            
        }
        
        for (int j = 0; j < dizi.length; j++) {
            System.out.print(" "+dizi[j]);
            
        }
        System.out.println();
        System.out.println("ilk kutumuza düşen top sayısı:      "+dizi[0]);
        System.out.println("ikinci kutumuza düşen top sayısı:   "+dizi[1]);
        System.out.println("üçüncü kutumuza düşen top sayısı:   "+dizi[2]);
        System.out.println("dördüncü kutumuza düşen top sayısı: "+dizi[3]);
        System.out.println("beşinci kutumuza düşen top sayısı:  "+dizi[4]);
        System.out.println("altıncı kutumuza düşen top sayısı:  "+dizi[5]);
        System.out.println("yedinci kutumuza düşen top sayısı:  "+dizi[6]);
        
        
    }
    
    public static double topu_at(double toplam){
       
        Random rastgele = new Random();
        Scanner input = new Scanner(System.in);     
        
        int sayac =0;
        int dizi[] = new int [7];
                
        toplam = 3.5;
        while(sayac<8){
        int şans = rastgele.nextInt(2);
        if(şans == 1){
            
        toplam = toplam + 0.5;
            
        }else{
            
        toplam = toplam - 0.5;   
  
        }
        
        
        sayac++;
        
        }
        return toplam;
    }
    
    
}
