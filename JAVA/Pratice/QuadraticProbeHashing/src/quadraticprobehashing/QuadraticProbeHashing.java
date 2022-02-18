
package quadraticprobehashing;

/**
 *
 * @author tee
 */
public class QuadraticProbeHashing<T> {
    public HashEntry<T>[] dizi;
    public int elemanSayisi;

    public QuadraticProbeHashing() {
        dizi=new HashEntry[23];
    }
    public QuadraticProbeHashing(int boyut){
        dizi=new HashEntry[boyut];
    }
    public int hash(T deger) {
        return deger.hashCode()%dizi.length;
    }

    public void ekle(T eleman){
        int sıra;
        int adım;
        int sonraki;
        
      sıra = hash(eleman);
  
      int i =0;
      int mod = sıra;
      
      while(dizi[mod] != null && dizi[mod].isActive == true ){
         
       i++;
          
       mod = (sıra+i*i) % dizi.length; 
          
      }
        //Karesel sondalama ekleme işlemini gerçekleştirin
    dizi[mod] = new HashEntry<T>(eleman);   
    
}
    public boolean sil(T eleman){
      int sıra;
      int adım;
      int sonraki;
        
      sıra = hash(eleman);
  
      int i =0;
      int mod = sıra;
      
      while(dizi[mod] != null && !dizi[mod].value.equals(eleman) ){
          
      mod = (sıra+i*i) % dizi.length; 
     
      i++;
      }if(dizi[mod] != null && dizi[mod].value.equals(eleman) ){
          dizi[mod].isActive = false;
      }else{
        dizi[mod].isActive = false;
      }
     //karesel sondalama silme işlemini gerçekleştirin
        return true;
        
        
        
    }

}


   

