package com.expensetracker.budget.model;

import java.util.ArrayList;

import com.expensetracker.money.Money;

public class BudgetModel {

    public ArrayList<Money> budget = new ArrayList<>();

    public ArrayList<Money> getBudget() {
        return budget;
    }
}
