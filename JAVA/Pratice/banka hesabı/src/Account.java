
public class Account {

    
    public static void main(String[] args) {
       
        
        
       banka_hesabı banka_hesabım = new banka_hesabı();
        
        banka_hesabım.bakiye_sorgula();
        banka_hesabım.para_yatır(800);
        System.out.println();
        banka_hesabım.bakiye_sorgula();
        banka_hesabım.para_çek(600);
        System.out.println();
        banka_hesabım.bakiye_sorgula();
        banka_hesabım.vadeli_yatır(1000,5,10);
        System.out.println();
        banka_hesabım.bakiye_sorgula();
        
    }
    
}
