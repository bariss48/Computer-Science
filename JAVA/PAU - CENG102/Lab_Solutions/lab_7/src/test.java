import java.util.Scanner;
/**
 *
 * @author 09.10.2021 Baris
 */
public class test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{

        Araç arabalar[] = new Araç[5];    
        Araç arabalar_iki[] = new Araç[5];    
        Otopark otopark = new Otopark(5,5,0,"asd",10);    
        Araç araba1 = new Araç("berk",35);
        Araç araba2 = new Araç("baris",34);
        Araç araba3 = new Araç("murat",42);
        Araç araba4 = new Araç("alper",20);
        Araç araba5 = new Araç("oğuz",15);

        
        for (int i = 0; i < arabalar.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Arabaların isimlerini ve plakalarını giriniz: (sırasıyla)");
            System.out.println(i+ "inci araba:");
            String araç_sahibi = input.next();
            int plaka = input.nextInt();
            arabalar[i] = new Araç(araç_sahibi,plaka);
            plaka = 0;
            araç_sahibi = "";            
        }
        System.out.println("------>>> OTOPARK-1'E HOŞGELDİNİZ <<<------");
        System.out.println("-------------------********----------------");
        System.out.println("----------------**************-------------");
        System.out.println("-------------********************----------");
        System.out.println("-----------************************--------");
        System.out.println("---------*****************************-----");
        System.out.println("------------***----***---***----***--------");
        System.out.println("--------------*****---------*****----------");
        System.out.println("-------------------------------------------");

        otopark.yazdır(arabalar);
        System.out.println("Otopark-1 kazanç:"+otopark.otoparkın_kazancı(arabalar));
        
        System.out.println("------>>> OTOPARK-2'E HOŞGELDİNİZ <<<------");
        System.out.println("-------------------********----------------");
        System.out.println("----------------**************-------------");
        System.out.println("-------------********************----------");
        System.out.println("-----------************************--------");
        System.out.println("-------------********-----********---------");
        System.out.println("------------***----***---***----***--------");
        System.out.println("--------------*****---------*****----------");
        System.out.println("-------------------------------------------");
        
        otopark.arac_kabul_etme(araba1,arabalar_iki);
        otopark.arac_kabul_etme(araba2,arabalar_iki);
        otopark.arac_kabul_etme(araba3,arabalar_iki);
        otopark.arac_kabul_etme(araba4,arabalar_iki);
        otopark.arac_cıkarma(araba4,arabalar_iki);
        otopark.arac_cıkarma(araba3,arabalar_iki);
        System.out.println("Otopark-2 kazanç:"+otopark.otoparkın_kazancı(arabalar_iki));
        //otopark.arac_kabul_etme(araba5,arabalar_iki);
        try{
           otopark.yazdır(arabalar_iki);
        }catch(NullPointerException e){
         System.err.print("NULL");
        }
        
    }
    
}
