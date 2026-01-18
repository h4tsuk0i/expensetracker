package com.expensetracker.date.model;

import java.util.Calendar;


public class DateModel {
    
    public Calendar budgetRangeStart;
    public Calendar budgetRangeEnd = Calendar.getInstance();
 

    public DateModel(){
        budgetRangeStart = Calendar.getInstance();
        budgetRangeEnd.add(Calendar.MONTH, 1);

    }

    public Calendar getBudgetRangeStart() {
        return budgetRangeStart;
    }

    public void setBudgetRangeStart(Calendar budgetRangeStart) {
        this.budgetRangeStart = budgetRangeStart;
    }

    public Calendar getBudgetRangeEnd() {
        return budgetRangeEnd;
    }

    public void setBudgetRangeEnd(Calendar budgetRangeEnd) {
        this.budgetRangeEnd = budgetRangeEnd;
    }

}
