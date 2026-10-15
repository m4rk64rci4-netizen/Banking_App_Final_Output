package com.bank.dao;

import com.bank.model.Account;

import java.sql.SQLException;
import java.sql.Connection;
import java.math.BigDecimal;
import java.util.List;

public interface AccountDAO {

    void createAccount(Account account) throws SQLException;

    List<Account> findByAllAccounts() throws SQLException;

    void updateBalance(String accountNumber, BigDecimal balance) throws SQLException;

    void updateBalance(Connection conn, String accountNumber, BigDecimal balance);


}
