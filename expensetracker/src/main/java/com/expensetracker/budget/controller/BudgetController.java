package com.expensetracker.budget.controller;

import java.util.ArrayList;
import java.util.Currency;

import com.expensetracker.budget.model.BudgetModel;
import com.expensetracker.money.Money;

public class BudgetController {
    private final BudgetModel budgetModel;

    public BudgetController(BudgetModel budgetModel){
        this.budgetModel = budgetModel;
    }

    public void addCurrencyToBudget(Money money){
        ArrayList<Currency> currencies = new ArrayList<>();
        ArrayList<Money> budget = budgetModel.getBudget();

        for (int i = 0; i < budget.size(); i++) { //add currencies to temp ArrayList
            currencies.add(budget.get(i).getCurrency());
        }

        if(!currencies.contains(money.getCurrency()) || currencies.isEmpty() && money.getAmount().doubleValue() > 0){ //add to budget if there is no money of that currency in budget or budget is empty and positive
            budget.add(money);
        } else
            addMoneyToExistingCurrency(money);
    }

    public void addMoneyToExistingCurrency(Money money){
        ArrayList<Money> budget = budgetModel.getBudget();

        for (int i = 0; i < budget.size(); i++) {
            if(budget.get(i).getCurrency() == money.getCurrency() && money.getAmount().floatValue() > 0){ //check where Money with same Currency is located and make sure the added amount is not negative
                budget.get(i).setAmount(budget.get(i).getAmount().doubleValue() + money.getAmount().doubleValue());
                return;
            }
        }
    }


}
