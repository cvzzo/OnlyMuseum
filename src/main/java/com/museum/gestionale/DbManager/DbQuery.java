package com.museum.gestionale.DbManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Service
public class DbQuery {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DbQuery(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Map<String, Object>> executeQuery(String sql) {
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getallOpere() {
        String sql = "SELECT * FROM opera";
        return executeQuery(sql);
    }
}