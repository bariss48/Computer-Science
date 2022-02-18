/**
 *
 * @author ßÆ®I$ 07.10.2021
 */
public class test{
    
    public static void main(String[] args) {
        
        Account account = new Account("T.R İş Bankası",20,1000);
        System.out.println("Bank: "+account.getYour_bank_name());
        System.out.println("Account Id: "+account.getAccount_id());
        System.out.println("Total Money: "+account.getTotal_money());
        withdraw_money(account, 500);
        System.out.println("New Total: "+account.getTotal_money());
        deposit(account, 1000);
        System.out.println("New Total: "+account.getTotal_money());
    }
    
    public static int withdraw_money(Account account,int money){
       int temp = 0;
       if(account.getTotal_money() > money)
       temp = account.getTotal_money() - money;
       account.setTotal_money(temp); 
              
       return account.getTotal_money();
    }
    public static int deposit(Account account,int money){
       int temp = 0;
       temp = account.getTotal_money() + money;
       account.setTotal_money(temp); 
              
       return account.getTotal_money();
    }

}
