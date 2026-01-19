package com.expensetracker.task;

import java.time.LocalDate;

import com.expensetracker.category.model.Category;
import com.expensetracker.money.Money;

public class Task {
    
    public Category category;
    public Money amount;
    public LocalDate dueDate;
    public String name;

    public Task(Money amount, Category category, LocalDate dueDate, String name) {
        this.amount = amount;
        this.category = category;
        this.dueDate = dueDate;
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public Money getAmount() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getName() {
        return name;
    }
}
