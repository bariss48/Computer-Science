
public class String_deneme {

    public static void main(String[] args) {
        
        String kelime_4 = new String("Welcome To JAVA");
        String kelime_1 = new String("Welcome To JAVA");
        String kelime_2 = "Welcome To JAVA";
        String kelime_3 = "Welcome To JAVA";
        String isim = "Barış";
        String yazılımcı = "-Bilgisayar Mühendisi";
        String tut;
        
        if(kelime_4.equalsIgnoreCase(kelime_3)){
            
            System.out.println("doğru");
        }
        if(kelime_4.equals(kelime_3)){
            
            System.out.println("doğru");
            
            
        }
        if(kelime_4.contains(kelime_3)){
        
         System.out.println("doğru");
        
    }
      tut =isim.concat(yazılımcı);
    System.out.println(tut);
    
    if(kelime_1.compareTo(kelime_2)==0){
        
        System.out.println("Eşitler");
    }
     if(kelime_2.compareTo(kelime_3)==0){
        
        System.out.println("Eşitler");
    }
     
     System.out.println(kelime_2.charAt(10));
     System.out.println(kelime_2.charAt(11));
     System.out.println(kelime_2.charAt(1));
     System.out.println(kelime_2.charAt(kelime_2.length()-1));
     System.out.println(kelime_2.charAt(kelime_2.lastIndexOf("W")));
     System.out.println(kelime_2.substring(1)); // sonrasını yazdırıyor...
     System.out.println(kelime_2.replace("J","a")); 
     System.out.println(kelime_2.trim()); 
     
     String tokens[] = "Java#HTML#Perl".split("#",3);// 3 olan sayı ne anlam ifade ediyor
     
        for (int i = 0; i < tokens.length; i++) {
             System.out.println(tokens[i]+" ");
            
        }
     char [] karakter = "JAVA".toCharArray();
     String [] isimler = {"Ahmet","Barış","Yılmaz","Sneijder","Mesut"};
     char [] ad = "Berk Barış Kara".toCharArray();
     
     
     for(int i =0;i<4;i++){
         System.out.println(karakter[i]+" ");
}
     for(int k =0;k<isimler.length;k++){
         
       System.out.println(isimler[k].toCharArray());
         
     }
     for(int k =0;k<ad.length;k++){
         
       System.out.println(" "+ad[k]);
         
     }
    System.out.println( String.valueOf(karakter));// isimler listesini gönderince sıkıntı oluyor
    
    
     
     
    }
    
    
    
}