    public class Gemi {

    String Name;
    String Year;




    public Gemi(String Name,String Year){

        this.Name=Name;
        this.Year=Year;


    }


    public String Name() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String toString(){

        return this.Name + " " + this.Year;
    }


}

