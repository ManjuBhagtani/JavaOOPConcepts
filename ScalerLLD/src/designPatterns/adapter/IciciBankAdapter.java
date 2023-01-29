package designPatterns.adapter;

import designPatterns.adapter.thirdParty.banks.IciciBankAPI;

public class IciciBankAdapter implements BankAPIAdapter {

    private IciciBankAPI iciciBankAPI;

    public IciciBankAdapter(){
        this.iciciBankAPI = new IciciBankAPI();
    }
    @Override
    public float checkBalance(String accountNo, String pin) {
        //write logic to check balance using IciciBankAPI
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        //write logic to authenticate using IciciBankAPI
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        //write logic to do transaction using IciciBankAPI
        return false;
    }
}
