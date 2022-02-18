
import odev4graph.Odev4AbstractGraph;



public class Odev4Graph<T> extends Odev4AbstractGraph<T> {
    /**
     * Mevcut çizgenin komşuluk matrisini hesaplayıp geri döndürür
     * @return Komşuluk matrisi(iki boyutlu tamsayı dizisi)
     */
    @Override
    public int[][] adjacencyMatrix() {
        
       
        
        
        
        return null;
    }

    /**
     * Mevcut çizgenin parametre olarak gönderilen çizge ile eşit olup
     * olmadığını döndürür. İki çizgenin birbirine eşit olması için düğümlerin
     * (vertex) referansları farklı olsa bile değerlerinin eşit olması ve de
     * tüm kenarların her iki çizgede de aynı düğümler arasında olması gerekir
     * @param g2 Eşitlik kontrolü için gönderilen çizge parametresi
     * @return Eşit için true aksi halde false döner
     */
    @Override
    public boolean equals(Odev4AbstractGraph<T> g2) {
        return true;
    }
}
