
public class Test {
    public static void main(String[] args) {
        
        student öğrenci = new student("barış","kara",182,3,"computer","denizli","pamukkale university",21);
        engineer a = new engineer("mobile","algorthm","barış","kara",182,3,"computer","denizli","pamukkale university",21);
        Medical b = new Medical("alper",5,"barış","kara",182,3,"computer","denizli","pamukkale university",21);
        
       // öğrenci.show();
        a.show();
        System.out.println();
        öğrenci.show();
        System.out.println();
        b.operation();
        System.out.println();
        b.school();
        System.out.println();
        a.işlem(15.9);
        System.out.println();
       System.out.print( öğrenci.toString() );
        
        
    }
}
