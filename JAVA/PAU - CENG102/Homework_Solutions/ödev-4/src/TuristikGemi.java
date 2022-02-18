
   public class TuristikGemi extends Gemi{

    int passangerCount;

    public TuristikGemi(String Name,String Year,int passangerCount){

        super(Name,Year);

        this.passangerCount=passangerCount;

    }

       public int getPassangerCount() {
           return passangerCount;
       }


       public void setPassangerCount(int passangerCount) {
           this.passangerCount = passangerCount;
       }

      public String toString(){

        return  super.toString() + " " +this.passangerCount;




      }
   }
