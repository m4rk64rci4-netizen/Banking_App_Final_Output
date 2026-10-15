package com.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter


public class Transaction {
    private Long transactionId;
    private String accountNumber;
    private TransactionType transactionType;
    private BigDecimal amount;
    private BigDecimal newBalance;
    private String referenceNumber;
    private String remarks;
    private LocalDateTime createdAt;

    public Transaction(String accountNumber, TransactionType transactionType, BigDecimal amount, BigDecimal newBalance, String referenceNumber, String remarks) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.newBalance = newBalance;
        this.referenceNumber = referenceNumber;
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return String.format(
                "Transaction{id = %d, ref = '%s', account = '%s', type = '%s', amount = %.2f, balance }",
                transactionId, referenceNumber, accountNumber,
                transactionType, newBalance
        );
    }
}
