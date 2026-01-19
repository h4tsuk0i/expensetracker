package com.expensetracker.task;

import java.time.LocalDate;
import java.util.UUID;

import com.expensetracker.category.model.Category;
import com.expensetracker.date.DateRange;
import com.expensetracker.money.Money;

public class Task {
    
    public Category category;
    public Money amount;
    public LocalDate dueDate;
    public String name;
    public DateRange dateRange;
    public UUID uuid;

    public Task(Money amount, Category category, DateRange dateRange, LocalDate dueDate, String name) {
        this.amount = amount;
        this.category = category;
        this.dueDate = dueDate;
        this.name = name;
        this.dateRange = dateRange;
        this.uuid = UUID.randomUUID();
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

    public DateRange getDateRange() {
        return dateRange;
    }

    public UUID getUuid() {
        return uuid;
    }
}
