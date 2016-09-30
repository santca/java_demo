package com;

import java.sql.*;
import java.util.Map;

/**
 * Created by chenyan on 2016/9/30.
 */
public class DBUtils {

    public static Connection getConnection() {

        Map<String,String> configMap = FileUtils.getConfigMap();

        String driver = configMap.get("driver");
        String url = configMap.get("url");
        String username = configMap.get("username");
        String password = configMap.get("password");

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
