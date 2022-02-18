
public class ortak {

   
    public static void main(String[] args) {
     
     
        calisanlar calisan_1;
        
        calisan_1 = new mühendis();
        
        calisan_1.setAge(20);
        
        calisan_1.emeklilik();
        System.out.println();
        mühendis mühendis_1 = new mühendis();
        
        mühendis_1.setName("Alper");
        mühendis_1.setPc_name("İmac");
        mühendis_1.setAge(30);
        mühendis_1.çalış();
        mühendis_1.emeklilik();
        mühendis_1.setSuc(false);
        System.out.println();
        mühendis_1.sicil();
        mühendis_1.merhaba();
        
      System.out.println(  mühendis_1.compareTo(mühendis_1) );
        
        
    }
    
}
