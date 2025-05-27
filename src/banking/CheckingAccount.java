package banking;

public class CheckingAccount implements  Account{
    @Override
    void withdraw(int amount) {
        if(this.amount >= amount){
            this.amount -= amount;
        }
    }

    @Override
    void deposit(int amount) {
        this.amount += amount;

    }
}

