package designPatterns.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;
    public PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI = bankAPI;
    }

    public boolean doTransaction(String fromAccount, String toAccount, float amount, String accountNo, String pin){
        if(bankAPI.authenticate(fromAccount, pin)){
            float balance = bankAPI.checkBalance(fromAccount, pin);
            if(balance >= amount){
                if(bankAPI.transaction(fromAccount, toAccount)){
                    return true;
                }
            }
        }
        return false;
    }
}
