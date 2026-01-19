package com.expensetracker.budget.model;

import java.util.ArrayList;
import java.util.Currency;

import com.expensetracker.money.Money;

public class BudgetModel {
    

    public ArrayList<Money> budget = new ArrayList<>();
    

    public BudgetModel(){
        budget.add(new Money(0, Currency.getInstance("USD")));
    }

    public ArrayList<Money> getBudget() {
        return budget;
    }
}
