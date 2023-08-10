package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "transaction_history",schema = "mts_db")
public class TransactionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txn_id")
    private int id;
    @Column(name = "txn_date")
    private LocalDateTime dateTime;
    @Column(name = "account_number")
    private String accountNumber;
    private double amount;
    @Column(name = "txn_type")
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

}
