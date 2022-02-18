/**
 *
 * @author 09.10.2021 Baris Kara // student of PAU
 */
public class Otopark extends Araç{
    private int otopark_kapasite;
    private int park_ücreti;
    private int toplam_kazanç;
    private Araç array[] = new Araç[this.otopark_kapasite];

    public Otopark(int otopark_kapasite, int park_ücreti, int toplam_kazanç, String arac_sahibi, int plaka_numarası) {
        super(arac_sahibi, plaka_numarası);
        this.otopark_kapasite = otopark_kapasite;
        this.park_ücreti = park_ücreti;
        this.toplam_kazanç = toplam_kazanç;
    }
    
    public int getOtopark_kapasite() {
        return otopark_kapasite;
    }

    public void setOtopark_kapasite(int otopark_kapasite) {
        this.otopark_kapasite = otopark_kapasite;
    }
    
    public int getPark_ücreti() {
        return park_ücreti;
    }

    public void setPark_ücreti(int park_ücreti) {
        this.park_ücreti = park_ücreti;
    }

    public int getToplam_kazanç() {
        return toplam_kazanç;
    }

    public void setToplam_kazanç(int toplam_kazanç) {
        this.toplam_kazanç = toplam_kazanç;
    }
    
    public void arac_kabul_etme(Araç araba ,Araç array[]){
          
       // if( otopark_müsait_mi(array) == true ){
              
            for (int i = 0; i < array.length; i++) {                
                   if(array[i] == null){
                      array[i] = araba;                      
                      break;                   
                    }                                                                                      
            }         
        //}
    }
    
    public void arac_cıkarma(Araç araba,Araç array[]){
     
       
        for (int i = 0; i < array.length; i++) {            
            try{            
                if(array[i].equals(araba)){            
                    array[i] = null;
                    }                
            }catch(NullPointerException e){}
        }            
    }
        
    public boolean otopark_müsait_mi(Araç array[]){
     
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                
            }
        }
        return true;        
    }
    
    public void yazdır(Araç array[]){
    
//        for (int i = 0; i < array.length-1; i++) {
            //System.out.println("Aracın sahibi: "+ array[i].getArac_sahibi() +" "+"Plaka numarası:"+array[i].getPlaka_numarası());            
//        }
         
         for (Araç araba : array) {
            System.out.println(araba.getArac_sahibi()+"-"+araba.getPlaka_numarası());
        }
    
    }
    
     public int otoparkın_kazancı(Araç array[]){
     
        int counter = 1;         
         
        for (int i = 0; i < array.length-1; i++) {
                       
            if(array[i] != null){
            
               counter += 1;
                
            }
            
        }
        
        return counter * this.park_ücreti;
    
    }
       
}
