import java.util.Scanner;
/**
 *
 * @author ßA®I$ 06.10.2021
 */
public class integral {

    public static void main(String[] args) {        
        //QUEST-1  
        Scanner input = new Scanner(System.in);
        String name,sur_name;             
        System.out.println("Adınızı giriniz: ");
        name = input.nextLine();
        System.out.println("Soy-Adınızı giriniz: ");
        sur_name = input.nextLine();            
        System.out.println(name +' '+sur_name);
        //QUEST-2 
        int sayi_bir , sayi_iki;
        System.out.println("Sayı-1'i giriniz: ");
        sayi_bir = input.nextInt();
        System.out.println("Sayı-2'i giriniz: ");
        sayi_iki = input.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println(sayi_bir + sayi_iki);
        }
        //QUEST-3 
        double sayi_uc,sonuc,ilk_integral,ikinci_integral;
        sayi_uc = 5;
        ilk_integral = Math.pow(sayi_uc, 3) / 3;
        sayi_uc = -5;
        ikinci_integral = Math.pow(sayi_uc, 3) / 3;
        sonuc = ilk_integral - ikinci_integral;
        System.out.println(sonuc); //83.33333333333333
    }    
}
