
 class SavingsAccount {
     static float annualIntrestRate;
     float savingsBalance;
     float monthlyInterest;

    public void calculateMonthlyInterest() {
        monthlyInterest = savingsBalance * annualIntrestRate / 12;
        System.out.println("monthly interest: $" + monthlyInterest);
    }

    public SavingsAccount(float i) {
        this.savingsBalance = i;
    }

    public static void modifyInterestRate(float interestRate) {
        annualIntrestRate = interestRate / 100;
    }

    private void calculateSavings() {
        savingsBalance += monthlyInterest;
    }


    public void print() {
        calculateSavings();
        System.out.println("total balance: $ " + savingsBalance);
    }

}