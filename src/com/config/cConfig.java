package com.config;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class cConfig {
    private final MysqlDataSource dataSource = new MysqlDataSource();
    private final String DB_URL = "jdbc:mysql://localhost:3306/"
            + "penjualan?serverTimezone=Asia/Jakarta";
    private final String DB_USERNAME = "putra";
    private final String DB_PASSWORD = "@Padangaro26";

    public Connection getConnection() throws SQLException {
        try {
            dataSource.setUrl(DB_URL);
            dataSource.setUser(DB_USERNAME);
            dataSource.setPassword(DB_PASSWORD);
            Connection conn = dataSource.getConnection();
            System.out.println("Koneksi berhasil");
            return conn;
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            throw e;
        }
    }
}

