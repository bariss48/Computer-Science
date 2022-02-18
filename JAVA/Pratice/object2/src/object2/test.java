
public class test {
    
    
    private int hesapno;
    private String isim;
    private String bankaadi;
    private int sifre;
    private int islemturu;
    private int bakiye;
    
    public test(int hesapno,String isim,String bankaadi,int sifre,int islemturu,int bakiye){
        
        this.bakiye = bakiye;
        this.bankaadi=bankaadi;
        this.hesapno = hesapno;
        this.isim = isim;
        this.islemturu = islemturu;
        this.sifre = sifre;
        
        
    }
    
    
    public void parayatir(double miktar){
        
        
        bakiye += miktar;
        
        System.out.println("yeni bakiyeniz:"+" "+bakiye);
        
        
    }
    
    public void paracek(double miktar){
        
        
        bakiye -= miktar;
        
        System.out.println("yeni bakiyeniz:"+" "+bakiye);
        
        
    }
     
    public void faiz(int miktar,int time){
        
        
        // bankanın faiz oranı %4 
        bakiye = (miktar*time*100*4)/365;
       
        
        System.out.println("yeni bakiyeniz:"+" "+bakiye);
        
        
    }
    
    /**
     * @return the hesapno
     */
    public int getHesapno() {
        return hesapno;
    }

    /**
     * @param hesapno the hesapno to set
     */
    public void setHesapno(int hesapno) {
        this.hesapno = hesapno;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the bankaadi
     */
    public String getBankaadi() {
        return bankaadi;
    }

    /**
     * @param bankaadi the bankaadi to set
     */
    public void setBankaadi(String bankaadi) {
        this.bankaadi = bankaadi;
    }

    /**
     * @return the sifre
     */
    public int getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    /**
     * @return the islemturu
     */
    public int getIslemturu() {
        return islemturu;
    }

    /**
     * @param islemturu the islemturu to set
     */
    public void setIslemturu(int islemturu) {
        this.islemturu = islemturu;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
   
    
}
