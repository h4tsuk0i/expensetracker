package com.expensetracker.category.controller;


import com.expensetracker.category.model.Category;

public class CategoryController {
    
    public Category createCategory(String name){
        
        if (name != null && !name.trim().isEmpty()) {
            return new Category(name);
        }else  
        throw new Error("String needs to be not empty and trimmed");
    }

}
