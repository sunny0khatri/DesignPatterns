package Adapter;

import Adapter.ThirdParty.ICICIBank;

public class ICICIBankAdapter implements BankAPI{

    ICICIBank bank=new ICICIBank();

    @Override
    public void transferMoney(String from, String to, double amount) {
        bank.transferMoney(amount,from,to);
    }

    @Override
    public double checkBalance(String accountNo) {
        return 0;
    }
}
