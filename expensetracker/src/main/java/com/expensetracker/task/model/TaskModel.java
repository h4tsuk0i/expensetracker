package com.expensetracker.task.model;

import java.util.Calendar;

public class TaskModel {
    
    public String category;
    public Number cost;
    public Calendar dueDate = Calendar.getInstance();

    public TaskModel() {
        this.category = "category";
        this.cost = 0;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Number getCost() {
        return cost;
    }

    public void setCost(Number cost) {
        this.cost = cost;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }
}
