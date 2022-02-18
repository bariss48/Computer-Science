
package rectangle;

/**
 *
 * @author tee
 */
public class Rectangle {

    
    public static void main(String[] args) {
        
        
        nesne_oluştur üçgen = new nesne_oluştur();
        
        üçgen.setGenişlik(1124);
        üçgen.setYükseklik(598);
       // System.out.println("Üçgenin alanı: "+üçgen.getArea(10, 80));
        System.out.println("Üçgenin genişliği: "+üçgen.Genişlik);
        System.out.println("Üçgenin yüksekliği: "+üçgen.Yükseklik);
        System.out.println("Üçgenin alanı: "+üçgen.getArea(üçgen.Genişlik,üçgen.Yükseklik));
    }
    
}
