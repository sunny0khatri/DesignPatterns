package Adapter.ThirdParty;

public class YesBank {
    public void sendMoney(double amount, String from, String to){
        System.out.println("Rs "+amount+" transferred from "+from+ " to "+to+". Thank you for using Yes Bank");
    }
}
