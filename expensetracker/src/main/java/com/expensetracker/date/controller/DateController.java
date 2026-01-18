package com.expensetracker.date.controller;

import java.time.LocalDate;
import java.time.Period;

import com.expensetracker.date.model.DateRange;

public class DateController {
    
    public DateRange createDateRange(LocalDate start, LocalDate end){
        DateRange dateRange = new DateRange(start, end);
        if (Period.between(start, end).getDays() > 0){
            return dateRange;
        }else
        throw new Error("End of date range can't be before the start");
    }
}
