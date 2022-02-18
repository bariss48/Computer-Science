
import java.util.Scanner;


public class Test {
    
    public static void main(String[] args) {
        
        Account hesabım = new Account(5,1000);
        
        Scanner input = new Scanner(System.in);
        
        while(true){
        
            

            System.out.println("ACCOUNT PROCESSING");
            System.out.println("1: BAKİYE KONTROL");
            System.out.println("2: PARA ÇEK");
            System.out.println("3: PARA YATIR");
            System.out.println("4: ÇIKIŞ");
            System.out.println();
            System.out.print("TERCİHİNİ GİRİNİZ:");    int karar = input.nextInt();
            
            System.out.println();
            
            switch(karar){
                
                case 1:
                hesabım.mevcut_bakiye();
                break;
                case 2:
                int miktar;
                System.out.print("Çekilecek miktar?: ");  miktar=input.nextInt();
                hesabım.paraçek(miktar);
                break;
                case 3:
                int money;
                System.out.print("Yatırılacak miktar?: ");  money=input.nextInt();
                hesabım.parayatır(money);   
                break;
                
            }
               System.out.println();
               System.out.println();
               
            if(karar == 4){
                System.out.print("İYİ GÜNLER ATM DEN ÇIKMIŞ BULUNMAKTASINIZ..");
                
                break;
            }
            
           
        }
        
        
    }
    
}
