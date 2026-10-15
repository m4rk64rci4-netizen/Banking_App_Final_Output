package com.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter

public class Account {
    private Long accountId;
    private String accountNumber;
    private String accountName;
    private BigDecimal balance;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Account(String accountNumber, String accountName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return String.format(
                "Account{id = %d, number = '%s', name = '%s', balance = %.2f }",
                accountId, accountNumber, accountName, balance
        );
    }
}
