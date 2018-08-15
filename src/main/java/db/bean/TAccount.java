package db.bean;

import java.io.Serializable;

public class TAccount implements Serializable {

    private long id;
    private long accountId;
    private String accountName;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
