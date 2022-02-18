
package algoritmalar_final;

  class Algoritmalar_final{     
    static int çubuk_kes(int price[],int n) 
    { 
        int val[] = new int[n+1]; // array oluşturuyoruz
        val[0] = 0; // eğer boşsa 0 a eşitliyoruz
        for (int i = 1; i<=n; i++) 
        { 
            int maks = Integer.MIN_VALUE; //en küçük değeri atıyoruz
            for (int j = 0; j < i; j++)      // gezerek maks değeri buluyoruz
                maks = Math.max(maks,  
                                   price[j] + val[i-j-1]); 
            val[i] = maks; //maks değeri arraye atıyourz
        } 
        return val[n]; 
    } 
    /* MAIN METHODUMUZ İÇİNDE TEST EDİYORUZ */
      public static void main(String args[]) 
    { 
        int array[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};        /* @author ßARIŞ*/
        int size = array.length; 
        System.out.println("Maksimum değerimiz: " + 
                            çubuk_kes(array, size)); 
    }  
} 

  
