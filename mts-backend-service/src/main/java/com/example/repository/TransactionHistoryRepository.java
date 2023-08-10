package com.example.repository;

import com.example.entity.TransactionHistory;
import org.springframework.data.repository.CrudRepository;

public interface TransactionHistoryRepository extends CrudRepository<TransactionHistory, Integer> {
}
