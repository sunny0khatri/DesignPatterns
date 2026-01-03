package Adapter;

import Adapter.ThirdParty.YesBank;

public class YesBankAdapter implements BankAPI{


    YesBank bank=new YesBank();
    @Override
    public void transferMoney(String from, String to, double amount) {
        bank.sendMoney(amount,from,to);
    }

    @Override
    public double checkBalance(String accountNo) {
        return 0;
    }
}
