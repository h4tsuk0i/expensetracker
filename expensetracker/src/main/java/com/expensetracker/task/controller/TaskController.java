package com.expensetracker.task.controller;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
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
    
    public Task createTask(BigDecimal amount, Currency currency, Category category, DateRange dateRange , LocalDate dueDate, String name){
        
        if (amount.doubleValue() > 0 && Period.between(LocalDate.now(), dueDate).getDays() >= 0) {
            Task task = new Task(new Money(amount, currency), category, dateRange ,dueDate, name);
            return task;
        } else 
            throw new Error("Money amount needs to be >0 and dueDate needs to be at least today.");  
    }
    
    public void addTaskToList(BigDecimal amount, Currency currency, Category category, DateRange dateRange , LocalDate dueDate, String name){
        taskModel.getTaskList().add(createTask(amount, currency, category, dateRange, dueDate, name));
    }
}
