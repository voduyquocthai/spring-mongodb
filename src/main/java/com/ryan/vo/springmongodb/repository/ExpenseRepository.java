package com.ryan.vo.springmongodb.repository;

import com.ryan.vo.springmongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense,String> {

}
