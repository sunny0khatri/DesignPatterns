package Adapter;

public interface BankAPI {
    public void transferMoney(String from, String to, double amount);
    public double checkBalance(String accountNo);
}
