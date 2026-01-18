package com.expensetracker.budget.model;

public class BudgetModel {
    

    public Number budget;

    public BudgetModel(){
        budget = 0;
    }

    public Number getBudget() {
        return budget;
    }

    public void setBudget(Number budget) {
        this.budget = budget;
    }
    
}
