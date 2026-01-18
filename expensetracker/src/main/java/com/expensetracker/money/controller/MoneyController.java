package com.expensetracker.money.controller;

import java.util.Currency;

import com.expensetracker.money.Money;

public class MoneyController {
    
    public void addMoney(Money money, Number addedAmount){
        money.setAmount(addedAmount);
    }

    public void subtractMoney(Money money, Number subtractedAmount){
        if (money.amount.doubleValue() > subtractedAmount.doubleValue()) {
            money.setAmount(money.getAmount().doubleValue() - subtractedAmount.doubleValue());
        }else
            throw new Error("Money cannot be negative.");
    }

    public void setMoneyCurrency(Money money, Currency currency){
        money.setCurrency(currency);
    }
}
