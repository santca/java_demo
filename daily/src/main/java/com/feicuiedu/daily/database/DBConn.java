package com.feicuiedu.daily.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by chenyan on 2016/10/10.
 */
public class DBConn {

    private static DBConn dbConn;

    private DBConn () {

    }

    public static DBConn getInstance() {

        if (dbConn == null) {
            dbConn = new DBConn();
        }

        return  dbConn;
    }


    public Connection getConneciton() {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://192.168.1.250:3306/reportdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "admin";

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        // 注册驱动
        try {
            Class.forName(driver);
            // 根据驱动获得连接
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
