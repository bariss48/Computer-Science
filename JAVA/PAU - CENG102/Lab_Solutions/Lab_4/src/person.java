/**
 *
 * @author ßA®I$
 */
public class person {
    
    String name,surname;
    int born_year; 
    
    public person(){}
    
    public person(String name,String surname,int born_year){
         
        this.name = name;
        this.surname = surname;
        this.born_year = born_year;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }
        
}

