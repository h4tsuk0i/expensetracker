package com.expensetracker.money;

import java.util.Currency;

public class Money {
    public Number amount;
    public Currency currency;

    public Money(Number amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Number getAmount(){
        return amount;
    }

    public Currency getCurrency(){
        return currency;
    }
}
