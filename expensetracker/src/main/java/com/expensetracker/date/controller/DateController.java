package com.expensetracker.date.controller;

import java.time.LocalDate;
import java.time.Period;

import com.expensetracker.date.DateRange;
import com.expensetracker.date.model.DateModel;

public class DateController {
    
    public final DateModel dateModel;

    public DateController(DateModel dateModel){
        this.dateModel = dateModel;
    }

    public DateRange createDateRange(LocalDate start, LocalDate end){
        DateRange dateRange = new DateRange(start, end);
        if (Period.between(start, end).getDays() > 27 && Period.between(start, end).getDays() >= Period.between(LocalDate.now(), end).getDays()){
            return dateRange;
        }else
        throw new Error("Invalid DateRange, length must be >0 and startpoint should be at least today");
    }

    public void addDateRange(LocalDate start, LocalDate end){
        dateModel.getDateRanges().add(createDateRange(start, end));
    }
}
