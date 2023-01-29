package designPatterns.adapter;

import designPatterns.adapter.thirdParty.banks.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter{

    private YesBankAPI yesBankAPI;

    public YesBankAdapter(){
        yesBankAPI = new YesBankAPI();
    }

    @Override
    public float checkBalance(String accountNo, String pin) {
        //write logic to check balance using YesBankAPI
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        //write logic to authenticate using YesBankAPI
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        //write logic to do transaction using YesBankAPI
        return false;
    }
}
