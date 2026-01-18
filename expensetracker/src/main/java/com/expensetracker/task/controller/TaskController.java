package com.expensetracker.task.controller;
import java.util.Calendar;
import java.util.Currency;

import com.expensetracker.money.Money;
import com.expensetracker.task.Task;

public class TaskController {
    
    public Task createTask(Number amount, Currency currency, String category, Calendar dueDate){
        Task task = new Task(new Money(amount, currency), category, dueDate);
        return task;
    }

}
