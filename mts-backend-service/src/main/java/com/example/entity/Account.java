package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "accounts",schema = "mts_db")
public class Account {
    @Id
    @Column(name = "number")
    private String number;
    @Column(name = "balance")
    private double balance;
}
