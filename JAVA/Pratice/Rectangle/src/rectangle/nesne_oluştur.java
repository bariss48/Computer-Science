
package rectangle;


public class nesne_oluştur {
    
    double Genişlik = 1.0;
    double Yükseklik = 1.0;
    
    
    public nesne_oluştur(){
        
        
    }
    public nesne_oluştur(double newGenişlik,double newYükseklik){
        
        Genişlik = newGenişlik;
        Yükseklik = newYükseklik;
    }

    public double getGenişlik() {
        return Genişlik;
    }

    public double getYükseklik() {
        return Yükseklik;
    }

    public void setGenişlik(double Genişlik) {
        this.Genişlik = Genişlik;
    }

    public void setYükseklik(double Yükseklik) {
        this.Yükseklik = Yükseklik;
    }
    
    public double getArea(double Yükseklik,double Genişlik){
        
        double rectangle_area;
        
        rectangle_area = (Yükseklik * Genişlik) / 2;
        
        return rectangle_area;
    }
    
    
}
