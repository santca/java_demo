package com;


import java.sql.*;
import java.util.*;

/**
 * Created by chenyan on 2016/9/29.
 */
public class TestJDBC {

    public static void main(String[] args) {


        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            connection = DBUtils.getConnection();

            StringBuffer sb = new StringBuffer();
            sb.append(" select 								");
            sb.append("	id,name,sex,birthday,password       ");
            sb.append(" from                                ");
            sb.append("	user_                               ");
            //sb.append(" where                               ");
            //sb.append(" name = '王鑫'            ");

            st = connection.createStatement();
            rs = st.executeQuery(sb.toString());

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                java.util.Date date = rs.getDate("birthday");

                System.out.println(id + ":" + name + ":" + date);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                rs.close();
                st.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
