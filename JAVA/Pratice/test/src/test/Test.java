
 
package test;


public class Test {

    
    public static void main(String[] args) {
        
        stok depo = new stok(90,5);
        
        
        
       depo.satmak_istiyor();
       depo.sat(30);
       System.out.println(depo.getStok_sayisi());
       System.out.println(depo.stokta_kalanların_değeri(60, 10));
       System.out.println(depo.getStok_sayisi());
       System.out.println(depo.stokta_kalanların_değeri(30, 5));
       System.out.println(depo.nekadar_eder(1001, 10));
       depo.sat(50);
       System.out.print(depo.stok_sayisi);
        
    }
    
}
