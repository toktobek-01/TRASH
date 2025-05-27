package banking;

public class Bank {
    private Account[];
    Bank() {
        this.accounts = new Account[]{};

    }
    void addAccount(Account account) {
        Account[] newAccounts = new Account[accounts.length + 1];
        for(int i = 0; i < this.accounts.length;++i) {
            newAccounts[newAccounts.length - 1] = account;
            this.accounts = newAccounts;
        }

        int totalAmmount() {
            int amount = 0;
            for(int i = 0; i< this.accounts.length; ++i) {
                amount += this.accounts[i].getCurrentAmount();
            }
        }
    }

}
