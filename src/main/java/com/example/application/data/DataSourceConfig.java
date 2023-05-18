package com.example.application.data;

import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

public class DataSourceConfig {
    String IP;
    String username;
    String password;

    public DataSourceConfig(String IP, String username, String password) {
        this.IP = IP;
        this.username = username;
        this.password = password;
    }

    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url(String.format("jdbc:postgresql://%s:5432/postgres", this.getIP()));
        dataSourceBuilder.username(this.getUsername());
        dataSourceBuilder.password(this.getPassword());
        return dataSourceBuilder.build();
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}