
public class engineer extends student{
    
    private String work;
    private String lesson;

    public engineer(String work, String lesson, String name, String surname, int number, int season, String depertman, String city, String college, int age) {
        super(name, surname, number, season, depertman, city, college, age);
        this.work = work;
        this.lesson = lesson;
    }
 
    
    public void working(){
        
        System.out.print("Engineer working on "+work+"...");
        
    }
    
    
    @Override
    public void show(){
        
        System.out.print("uğraş alanı: "+work+" "+"sevdiği ders: "+lesson+"Adı: (name):"+super.getName());
        
    }
    
    public void işlem(int a){
        
        System.out.print(a*a);
        
    }
    
    
}
