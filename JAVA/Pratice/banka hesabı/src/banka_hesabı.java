









public class banka_hesabı {
    
    private double annualInterestRate;
    private int id;
    private double balance;

   
    
    
    public banka_hesabı(){
        
    }

    public banka_hesabı(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
   
    
     public int getId() {
        return id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    
    
    
   public double  para_yatır(double para){
       
       balance += para;       
       
       
       return balance;
   }
    
    public double para_çek(double para){
        
        balance -= para;
        
        
        
        return para;
    }
    
    
    public double vadeli_yatır(double para,double faiz_oranı,double vade){
        
        
       return balance = balance + (para*faiz_oranı* (vade * 30)/100 ) /100;
        
        
    }
    
    
    public void bakiye_sorgula(){
        
        
        System.out.print(balance);
        
        
    }
            
    
    
    
}
