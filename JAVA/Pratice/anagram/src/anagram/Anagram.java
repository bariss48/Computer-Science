
package anagram;

import java.util.ArrayList;

/**
 *
 * @author tee
 */
public class Anagram {

  
    public static void main(String[] args) {
       
        
      System.out.print(isAnagram("berk","brke"));   // aynı harfler girince karışıyor
        
      
    }
    
    public static boolean isAnagram(String str,String kelime){
     
     int sayac=0;
        
       char [] kaydet = new char[str.length()];
       char [] save = new char[kelime.length()];
        
       kaydet=str.toCharArray();
       save = kelime.toCharArray();
       
     ArrayList<Character> listem = new ArrayList<Character>();   
     ArrayList<Character> liste = new ArrayList<Character>();      
        
     for(int i=0;i<str.length();i++){
         
         listem.add(kaydet[i]);
         
     }
      for(int i=0;i<str.length();i++){
         
         listem.add(save[i]);
         
     }
     
      
      for(int k=0;k<=str.length()-1;k++)
      
      for(int p=0;p<=str.length()-1;p++){
          
          if(kaydet[k] == save[p]){
              
              sayac++;
              
          }
          
          
          
      }
      
      if(sayac == str.length()){
          
          return true;
          
      }else
      
      
      return false;
}

}