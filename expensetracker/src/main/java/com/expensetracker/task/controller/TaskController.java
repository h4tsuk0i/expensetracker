package com.expensetracker.task.controller;
import java.time.LocalDate;
import java.util.Currency;

import com.expensetracker.category.model.Category;
import com.expensetracker.date.DateRange;
import com.expensetracker.money.Money;
import com.expensetracker.task.Task;
import com.expensetracker.task.model.TaskModel;

public class TaskController {

    private final TaskModel taskModel;

    public TaskController(TaskModel taskModel){
        this.taskModel = taskModel;
    }
    
    public Task createTask(Number amount, Currency currency, Category category, DateRange dateRange ,LocalDate dueDate, String name){
        
        Task task = new Task(new Money(amount, currency), category, dateRange ,dueDate, name);
        return task;
    }

    
}
