package com.expensetracker.task.controller;
import java.time.LocalDate;
import java.util.Currency;

import com.expensetracker.category.model.Category;
import com.expensetracker.money.Money;
import com.expensetracker.task.Task;

public class TaskController {
    
    public Task createTask(Number amount, Currency currency, Category category, LocalDate dueDate, String name){
        Task task = new Task(new Money(amount, currency), category, dueDate, name);
        return task;
    }
}
