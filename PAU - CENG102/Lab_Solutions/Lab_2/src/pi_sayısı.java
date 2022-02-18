import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ßA®I$ 06.10.2021
 */
public class pi_sayısı {

public static void main(String[] args) {
   double x,y,pi,sayac;
   double daireye_dusen = 0;
   double kare = 0;
   sayac=0;
   Random rastgele = new Random();
   long i = 0;   
   for(i=0;i<1000000000;i++){
      x = rastgele.nextDouble()-1;
      y = rastgele.nextDouble()-1;
      sayac++;
   if (Math.pow(x, 2) + Math.pow(y, 2) < 1) {
        daireye_dusen += 1;
      }else{
       kare++;
   }
   }
      pi = (daireye_dusen/sayac)*4;
      System.out.println(pi);
 }
}
