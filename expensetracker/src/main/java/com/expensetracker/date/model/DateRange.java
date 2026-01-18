package com.expensetracker.date.model;

import java.time.LocalDate;

public class DateRange {
    
    public LocalDate budgetRangeStart;
    public LocalDate budgetRangeEnd;
 
    public DateRange(LocalDate start, LocalDate end){
        budgetRangeStart = start;
        budgetRangeEnd = end;
    }

    public LocalDate getBudgetRangeStart() {
        return budgetRangeStart;
    }

    public LocalDate getBudgetRangeEnd() {
        return budgetRangeEnd;
    }
}
