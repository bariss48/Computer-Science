
public class Medical extends student{
    
    private String doctor;
    private int sayac;

    public Medical(String doctor, int sayac, String name, String surname, int number, int season, String depertman, String city, String college, int age) {
        super(name, surname, number, season, depertman, city, college, age);
        this.doctor = doctor;
        this.sayac = sayac;
    }
    
    public void operation(){
        
        System.out.print(doctor+" "+"in operation to"+" "+sayac+" "+"hours...");
        
        
    }
    public void school(){
        
        System.out.print("Doctore finished "+super.getCollege()+" ");
        
        
    }
    
}
