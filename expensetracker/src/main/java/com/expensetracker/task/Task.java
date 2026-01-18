package com.expensetracker.task;

import java.util.Calendar;

public class Task {
    
    public String category;
    public Number amount;
    public Calendar dueDate;

    public Task(Number amount, String category, Calendar dueDate) {
        this.amount = amount;
        this.category = category;
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public Number getAmount() {
        return amount;
    }

    public Calendar getDueDate() {
        return dueDate;
    }
}
