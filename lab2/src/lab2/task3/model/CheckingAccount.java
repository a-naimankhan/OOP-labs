package lab2.task3.model;

public class CheckingAccount  extends  Account{
    private int transacitionCount;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int a) {
        super(a);
        this.transacitionCount = 0;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transacitionCount++;
    }

    @Override
    public void withDrawl(double amount) {
        super.withDrawl(amount);
        transacitionCount++;
    }

    public void deductFee() {
        if (transacitionCount > FREE_TRANSACTIONS) {
            int extra = transacitionCount - FREE_TRANSACTIONS;
            double fee = extra * 0.02;
            super.withDrawl(fee);
        }
        transacitionCount = 0;
    }
}
