package Adapter.ThirdParty;

public class ICICIBank {
    public void transferMoney(double amount,String from, String to){
        System.out.println("Rs "+amount+" transferred from "+from+ " to "+to +". Thank you for using ICICI Bank");
    }
}
