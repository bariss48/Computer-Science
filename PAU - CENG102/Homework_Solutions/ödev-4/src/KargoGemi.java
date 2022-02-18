
public class TuristikGemi extends Gemi {

    int Totalweight;


    public TuristikGemi(int totalweight, String Name, String Year){
        super(Name,Year);
        this.setTotalweight(Totalweight);

    }


    public int getTotalweight() {
        return Totalweight;
    }

    public void setTotalweight(int Totalweight) {
        this.Totalweight = Totalweight;
    }

    public String toString(){

        return super.toString() + " " +this.Totalweight;


    }

}
