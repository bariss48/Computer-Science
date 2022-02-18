
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tee
 */
public class arkaplan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rastgele = new Random();
        
        double[] array = new double [10];
         double tut;
        
        System.out.println(array[2]);     // eğer bunu C dilinde yapsaydık bize bulunduğu adresi vericekti.
        
        for (int i = 0; i < array.length; i++) {
             array[i] = rastgele.nextInt(1000);
            
        }
      /*  System.out.println(array[5]);
        
        for(int k=0;k<array.length-1;k++){
            int index=0;
        if(array[index]>array[index+1]){
            
           tut = array[index+1]; 
           array[index+1] = array[index]; 
           array[index] = tut;
        
        }else{
            index++;
        }
    }
     */
    
      for(int a=0;a<array.length-1;a++){
          
          for(int b=array.length-1;b>a;b--){
              
              if(array[a]>array[b]){
                  
                 tut = array[b];
                 array[b]=array[a];
                 array[a]=tut; 
                  
              }
              
              
              
              
          }
          
          
          
      }
      
     System.out.println( array.toString());
     
     
      
        
        for (int h = 0; h < array.length; h++) {
            System.out.print(" "+array[h]+" "+"-");
            
        }
        
        indexdekini_sil(6,array);
        
        System.out.println();
        
          
        for (int h = 0; h < array.length; h++) {
            System.out.print(" "+array[h]+" "+"-");
            
        }
        System.out.println();
        
           LinkedList<String> sehirler = new LinkedList<String>();
        
          
        
        
           sehirler.add("Denizli");
           sehirler.add("Bursa");
           sehirler.add("İzmir");
        
           int uzunluk = sehirler.size();
           
           while(!sehirler.isEmpty() && uzunluk !=0){
               
               
               System.out.println(sehirler);
               uzunluk--;
           }
           String next="";
           for (Iterator<String> iterator = sehirler.iterator(); iterator.hasNext();) {
           next = iterator.next() ;
           System.out.println(next);
        }
       System.out.println(next);
        
       LinkedList<String> iller = new LinkedList<String>();
       ListIterator<String> iterator = iller.listIterator();
       
       iller.add("Denizli");
       iller.add("Bursa");
       iller.add("Ankara");
       iller.add("İzmir");
       iller.add("Muğla");
       iller.add("İstanbul");
       iller.add("Antep");
     /*  
       String bastır="";
       
      while(iterator.next()!=null){
           
         bastır=iterator.next();
         System.out.println(bastır);
           
       }
      */
     
    
     Stack raf = new Stack();
     String kelime = new String();
     kelime = "denizlispor";
     
     String sozcuk ="Barış";
     int yaş = 21;
     
     raf.push(kelime);
     raf.add(sozcuk);
     raf.push(iller);
     raf.push(yaş);
     System.out.print(raf);
     raf.pop();
     raf.pop();
     
     System.out.println();
     System.out.print(raf);
     
     
     
     System.out.println();
     System.out.println(raf.peek());
     iller.push(raf.toString());
     System.out.println();
     System.out.print(iller);
       
      LinkedList<String> sınav = new LinkedList<String>();
     
      System.out.println();
      sınav.add("ygs");
      sınav.add("lys");
      sınav.add("yks");
      sınav.add("oks");
      sınav.add("yds");
      System.out.println();
        System.out.print(sınav);
        System.out.println();
       System.out.print(sınav.peek());
    }   
    
    
    public static void indexdekini_sil(int index,double dizi[]){
        
        
        for (int i = index;i<dizi.length-1;i++) {
           
            dizi[i] = dizi[i+1];
            
            
        }
       
        
        
        
    }
    
    
}
