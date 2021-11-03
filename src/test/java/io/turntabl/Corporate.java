package io.turntabl;

public class Corporate extends Client{
    private String accountManager;

    public Corporate(String name,  Level serviceLevel, String accountManager) {
        super(name,  serviceLevel);
       this.accountManager = accountManager;
    }

    public String getAccountManger(){
        return accountManager;
    }

    @Override
    public String getContactName() {
        return null;
    }
}
