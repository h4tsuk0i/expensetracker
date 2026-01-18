package com.expensetracker.money;

public class Money {
    public Number amount;
    public String currency;

    public Money(Number amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Number getAmount(){
        return amount;
    }

    public void setAmount(Number amount){
        this.amount = amount;
    }

    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String type){
        this.currency = type;
    }
}
