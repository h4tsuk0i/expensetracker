package com.expensetracker.money;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {
    public BigDecimal amount;
    public Currency currency;

    public Money(BigDecimal amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public Currency getCurrency(){
        return currency;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
