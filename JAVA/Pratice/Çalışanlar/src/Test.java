
public class Test {
    public static void main(String[] args) {
        
        Çalışan a = new Çalışan();
        mühendis b = new mühendis();
        işçi c = new işçi();
        
        a.setÇalışan("Mustafa");
        b.setÇalışan("Barış");
        c.setÇalışan("alper");
        
        a.yemek_ye();
        System.out.println();
        b.yemek_ye();
        System.out.println();
        c.yemek_ye();
        System.out.println();
        
        
        a.iş();
        System.out.println();
        b.iş();
        System.out.println();
        c.iş();
    
        System.out.println();
        
        b.setMaaş(8000);
        c.setMaaş(1500);
        
        
        b.zam_yap(800);
        c.zam_yap(400);
        
        System.out.println("mühendisin maaşı: "+b.getMaaş());
        System.out.println("işçinin maaşı: "+c.getMaaş());
        System.out.println("Çalışanın maaşı: "+a.getMaaş()); 
        
        b.setComputer("İmac");
        b.pc_markası();
        
        
    }
    public static boolean uygun(String adi, double maas) {
        //Koşullara göre true veya false döndür
        return false;
    }
}
