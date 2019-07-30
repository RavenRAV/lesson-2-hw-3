package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum ){
        amount=amount+sum;
        System.out.println("Баланс"+amount);


    }
    public void withDraw(double sum) throws Exception{
        System.out.println(getAmount());
        if(sum > amount){
            throw new LimitException("Недостаточно средств - ",amount );

        }
        amount=amount-sum;
    }

}
