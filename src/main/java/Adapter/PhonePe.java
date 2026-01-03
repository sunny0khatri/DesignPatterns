package Adapter;

public class PhonePe {
    public static void main(String[] args) {
        BankAPI bankAPI=new YesBankAdapter();   //we can choose yes or icici bank adapter
        String firstAccount="12345";
        String secondAmount="67890";
        bankAPI.transferMoney(firstAccount,secondAmount,500);
    }


}
