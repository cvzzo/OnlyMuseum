package com.museum.gestionale.DbManager;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
public class DbQuery {
    private final Connection connection;

    public DbQuery() throws SQLException {
        this.connection = DbConnectionManager.getInstance().getConnection();
    }


}
