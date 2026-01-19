package com.expensetracker.task.model;

import java.util.ArrayList;

import com.expensetracker.task.Task;

public class TaskModel {
       
    public ArrayList<Task> taskList = new ArrayList<>();

    public ArrayList<Task> getTaskList() {
        return taskList;
    }
}
