class Application {

    public static void main(String[] args) {

        SavingsAccount saver1=new SavingsAccount(2000);
        SavingsAccount saver2=new SavingsAccount(4000);

        SavingsAccount.modifyInterestRate(4);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.print();
        saver2.print();

        SavingsAccount.modifyInterestRate(5);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.print();
        saver2.print();



    }

}
