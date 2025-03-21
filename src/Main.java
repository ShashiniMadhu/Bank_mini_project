public class Main {
    public static void main(String[] args) {
        AccountHolder jane = new AccountHolder("jane Smith","18/3/2000","Kaluthara");
        BankAccount janesbankaccount=new BankAccount(jane,"123456","FD");
        System.out.println(janesbankaccount.accountHolder.name);
        janesbankaccount.depositCash(1400);
        System.out.println(janesbankaccount.getBalance());
        janesbankaccount.withdrawCash();
        janesbankaccount.withdrawCash();
        janesbankaccount.withdrawCash();
        janesbankaccount.getAllWithdrawal();
        System.out.println(janesbankaccount.getTotValueAfterInterestForAPeriod(3));

    }
}