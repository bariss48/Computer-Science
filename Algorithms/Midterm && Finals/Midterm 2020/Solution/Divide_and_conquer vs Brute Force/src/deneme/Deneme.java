package deneme;

/**
 *
 * @author BERK BARIŞ KARA 18253007
 * 
 * ALGORİTMALAR ARA-SINAV ÖDEVİ
 */


 import java.util.*;
 
public class Deneme
{
  public static class Point
  {
    public final double x;
    public final double y;
 
    public Point(double x, double y)
    {
      this.x = x;
      this.y = y;
    }
 
    public String toString()
    {  return "(" + x + ", " + y + ")";  }
  }
 
  public static class Pair
  {
    public Point point1 = null; // nesnelerimizi null a eşitledik ki ilk başta null kalması için
    public Point point2 = null;
    public double distance = 0.0;
 
    public Pair() // default constractır
    {  }
 
    public Pair(Point point1, Point point2) //constractır
    {
      this.point1 = point1; 
      this.point2 = point2;
      calcDistance();
    }
 
    public void update(Point point1, Point point2, double distance)
    {
      this.point1 = point1;
      this.point2 = point2;
      this.distance = distance;
    }
 
    public void calcDistance()
    {  this.distance = distance(point1, point2);  }
 
    public String toString()
    {  return point1 + "-" + point2 + " : " + distance;  }
  }
 
  public static double distance(Point p1, Point p2)
  {
      // mesafeyi hesap ettiğimiz kısım
    double xdist = p2.x - p1.x;
    double ydist = p2.y - p1.y;
    return Math.hypot(xdist, ydist); // gene MATH kütüphanesinden faydalanarak mesafe hesabı yapılmıştır
    
  }
 
  public static Pair bruteForce(List<? extends Point> points)
  {
    int numPoints = points.size();
    if (numPoints < 2)
      return null; // noktalar çiftimiz 2 den küçük olamayacağı için return null
    Pair pair = new Pair(points.get(0), points.get(1)); // nesne çiftimizi oluşturduğumuz yer
    if (numPoints > 2)
    {
      for (int i = 0; i < numPoints - 1; i++)
      {
        Point point1 = points.get(i);
        // ilk nesnemizi aldığımız yer
        for (int j = i + 1; j < numPoints; j++)
        {
          Point point2 = points.get(j);
          // ikinci nesnemizi aldığımız yer
          double distance = distance(point1, point2);
          // mesafe
          if (distance < pair.distance)
              // eğer bulduğumuz mesafe daha küçükse nokta çiftimizi ve yeni mesafemizi uptade ediyoruz
            pair.update(point1, point2, distance);
        }
      }
    }
    return pair;
  }
 
  public static void sortByX(List<? extends Point> points)
  {
    Collections.sort(points, new Comparator<Point>() { // burda da Javada çoğu veri yapısınında kapısının çıktığı COLLECTION classındaki sort metodu ile sıralama yapılmıştır
        public int compare(Point point1, Point point2) // nesnelerimizi yani noktalarımızı compare karşlıaştırdığımız yer X e göre
        {
          if (point1.x < point2.x)
            return -1;
          if (point1.x > point2.x)
            return 1;
          return 0;
        }
      }
    );
  }
 
  public static void sortByY(List<? extends Point> points)
  {
    Collections.sort(points, new Comparator<Point>() { // burda da Javada çoğu veri yapısınında kapısının çıktığı COLLECTION classındaki sort metodu ile sıralama yapılmıştır
        public int compare(Point point1, Point point2) // nesnelerimizi yani noktalarımızı compare karşlıaştırdığımız yer Y e göre
        {
          if (point1.y < point2.y)
            return -1;
          if (point1.y > point2.y)
            return 1;
          return 0;
        }
      }
    );
  }
 
  public static Pair divideAndConquer(List<? extends Point> points)
  {
    List<Point> pointsSortedByX = new ArrayList<Point>(points); // iki tane arraylist tanımlıyoruz biri x'e göre diğeri y'e göre 
    sortByX(pointsSortedByX);
    List<Point> pointsSortedByY = new ArrayList<Point>(points);
    sortByY(pointsSortedByY);
    return divideAndConquer(pointsSortedByX, pointsSortedByY); // recursive birşekilde sonuna kadar arralistleri iki parça halinde sıraladık
  }
 // override ediyoruz metodumuzu burada 
  private static Pair divideAndConquer(List<? extends Point> pointsSortedByX, List<? extends Point> pointsSortedByY)
  {
      // sıralanmış X ve Y ARRAYLISTLERİMİZİ işleme koyarak sonuca gitmeye çalışıcaz
    int numPoints = pointsSortedByX.size();
    if (numPoints <= 3)
      return bruteForce(pointsSortedByX);
 
    int dividingIndex = numPoints >>> 1;
    List<? extends Point> leftOfCenter = pointsSortedByX.subList(0, dividingIndex); // arraylistlerimizi iki eşit parçaya ayırıyoruz
    List<? extends Point> rightOfCenter = pointsSortedByX.subList(dividingIndex, numPoints); // arraylistin subList metodu yardımı ile
 
    List<Point> tempList = new ArrayList<Point>(leftOfCenter); // gene temp mantığı ile bir arraylist tanımlıyoruz
    sortByY(tempList); // sıraladık
    Pair closestPair = divideAndConquer(leftOfCenter, tempList); // recursive olarak listenin solundaki en kısa nokta çiftini buluyoruz
 
    tempList.clear(); // temp listemizi boşaltıyoruz ki diğer kısımın en kısa çiftini alalım
    tempList.addAll(rightOfCenter);// arraylistimize ekliyoruz değerlerimizi
    sortByY(tempList);// sıralıyoruz
    Pair closestPairRight = divideAndConquer(rightOfCenter, tempList); // recursive olarak gene en sağ tarafın en kısa çiftini alıyoruz
 
    if (closestPairRight.distance < closestPair.distance)
      closestPair = closestPairRight;
       // eğer sağ taraf daha küçükse en kısa nokta çifti ordadır 
    tempList.clear();
    // birdaha boşaltıyoruz listemizi
    double shortestDistance =closestPair.distance;
    double centerX = rightOfCenter.get(0).x;
    for (Point point : pointsSortedByY)
      if (Math.abs(centerX - point.x) < shortestDistance)
        tempList.add(point);
      // listemize ekliyoruz en son işlem olarak en kısa noktaları
    for (int i = 0; i < tempList.size() - 1; i++)
    {
      Point point1 = tempList.get(i);
      for (int j = i + 1; j < tempList.size(); j++)
      {
        Point point2 = tempList.get(j);
        if ((point2.y - point1.y) >= shortestDistance)
          break;
        double distance = distance(point1, point2);
        if (distance < closestPair.distance)
        {
          closestPair.update(point1, point2, distance);
          shortestDistance = distance;
        }
      }
    }
    return closestPair;
  }
  
  
   public static void main(String[] args)
  {
      // burda da test işlemlerimizi ve milisaniye hesabı yapılmıştır
    int numPoints = (args.length == 0) ? 100000 : Integer.parseInt(args[0]);
    // kaç nokta atacağımıza karar verdiğimiz yer
    List<Point> points = new ArrayList<Point>();
    Random r = new Random(); // rastgeleliği sağlamak için random nesnesi
    for (int i = 0; i < numPoints; i++)
      points.add(new Point(r.nextDouble(), r.nextDouble()));
    System.out.println("TÜRETİLEN " + numPoints + " RASTGELE NOKTA");
    long startTime = System.currentTimeMillis();
    Pair bruteForceClosestPair = bruteForce(points);
    long elapsedTime = System.currentTimeMillis() - startTime;
    System.out.println("Brute force (" + elapsedTime + " ms): " + bruteForceClosestPair);
    startTime = System.currentTimeMillis();
    Pair dqClosestPair = divideAndConquer(points);
    elapsedTime = System.currentTimeMillis() - startTime;
    System.out.println("Divide and conquer (" + elapsedTime + " ms): " + dqClosestPair);
    if (bruteForceClosestPair.distance != dqClosestPair.distance)
      System.out.println("UYUŞMAZLIK");
  }
}
  
  

