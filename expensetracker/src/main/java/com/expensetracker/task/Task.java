package com.expensetracker.task;

import java.util.Calendar;

import com.expensetracker.money.Money;

public class Task {
    
    public String category;
    public Money amount;
    public Calendar dueDate;

    public Task(Money amount, String category, Calendar dueDate) {
        this.amount = amount;
        this.category = category;
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public Money getAmount() {
        return amount;
    }

    public Calendar getDueDate() {
        return dueDate;
    }
}
