
/**
 *
 * @author Barış
 */
public class student extends Object {

   private String name;
   private String surname;
   private int number;
   private int season;
   private String depertman;
   private String city;
   private String college;
   private int age;

    public student(String name, String surname, int number, int season, String depertman, String city, String college, int age) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.season = season;
        this.depertman = depertman;
        this.city = city;
        this.college = college;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public int getSeason() {
        return season;
    }

    public String getDepertman() {
        return depertman;
    }

    public String getCity() {
        return city;
    }

    public String getCollege() {
        return college;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setAge(int age) {
        this.age = age;
    }
  
    
    public void show(){
        
        System.out.print("Name: "+name+" "+"Surname: "+surname+" "+"age: "+age+" "+"Depertman: "+depertman+" "+"College name: "+college);
        
    }
    
    public void işlem(double a){
        
        System.out.print(a*a);
        
    }
    
    
    
   @Override
    public String toString(){
        
        return "JAVA ÇOK GÜZEL"+" "+name;
        
        
    }
    
    
    
    
}
