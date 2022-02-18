public class Account {

   private String your_bank_name;
   private int account_id;
   private int total_money;

    public Account(String your_bank_name, int account_id, int total_money) {
        this.your_bank_name = your_bank_name;
        this.account_id = account_id;
        this.total_money = total_money;
    }

    public String getYour_bank_name() {
        return your_bank_name;
    }

    public void setYour_bank_name(String your_bank_name) {
        this.your_bank_name = your_bank_name;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getTotal_money() {
        return total_money;
    }

    public void setTotal_money(int total_money) {
        this.total_money = total_money;
    }
    
    
    
}
