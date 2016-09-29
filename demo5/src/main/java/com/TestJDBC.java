package com;

import java.sql.*;

/**
 * Created by chenyan on 2016/9/29.
 */
public class TestJDBC {

    public static void main(String[] args) {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://192.168.1.250:3306/reportdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "admin";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);

            StringBuffer sb = new StringBuffer();
            sb.append(" select 								");
            sb.append("	id,name,sex,birthday,password       ");
            sb.append(" from                                ");
            sb.append("	user_                               ");
            sb.append(" where                               ");
            sb.append(" name = '王鑫'            ");

            Statement st = connection.createStatement();
            ResultSet rs  = st.executeQuery(sb.toString());

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id+":"+name);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
