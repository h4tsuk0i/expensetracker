package com.expensetracker.money.controller;

import java.math.BigDecimal;
import java.util.Currency;

import com.expensetracker.money.Money;

public class MoneyController {
    
    public void addMoney(Money money, BigDecimal addedAmount){
        money.setAmount(addedAmount);
    }

    public void subtractMoney(Money money, BigDecimal subtractedAmount){
        if (money.amount.doubleValue() > subtractedAmount.doubleValue()) {
            money.setAmount(money.getAmount().add(subtractedAmount));
        }else
            throw new Error("Money cannot be negative.");
    }

    public void setMoneyCurrency(Money money, Currency currency){
        money.setCurrency(currency);
    }
}
