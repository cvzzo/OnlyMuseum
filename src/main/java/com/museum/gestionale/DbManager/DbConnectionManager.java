package com.museum.gestionale.DbManager;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbConnectionManager {
    private static DbConnectionManager instance;
    private  Connection connection;

    private DbConnectionManager() {
        try{
            //to change based on pc
            String url = "jdbc:mysql://192.168.1.30:3306/mysql";
            String username = "test";
            String password = "test";
            this.connection = DriverManager.getConnection(url, username, password);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static synchronized DbConnectionManager getInstance(){
        if(instance == null){
            instance = new DbConnectionManager();
        }
        return  instance;
    }


    public Connection getConnection() {
        return connection;
    }
}
