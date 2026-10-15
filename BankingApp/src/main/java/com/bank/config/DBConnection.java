package com.bank.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DBConnection {
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());

    private static final String url = "jdbc:mysql://localhost:3306/banking_db";
    private static final String username = "root";
    private static final String password = "";

    public static Connection getConnection() throws SQLException{
        LOGGER.fine("Attempting to connect to the database" + url);

        try (Connection conn = DriverManager.getConnection(url, username, password)){
            LOGGER.fine("Successfully connected to the database.");
            return conn;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Failed to connect to database: " + e.getMessage());
            throw e;
        }
    }
}
