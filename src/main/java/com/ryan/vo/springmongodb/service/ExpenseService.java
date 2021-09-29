package com.ryan.vo.springmongodb.service;

import com.ryan.vo.springmongodb.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;


    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(){
    }

    public void updateExpense(){}

    public void getAllExpenses(){}

    public void getExpenseByName(){}

    public void deleteExpense(){}
}
