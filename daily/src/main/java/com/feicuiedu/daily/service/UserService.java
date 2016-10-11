package com.feicuiedu.daily.service;

import com.feicuiedu.daily.pojo.User;
import com.feicuiedu.daily.uitl.DBUtils;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyan on 2016/10/10.
 */
public class UserService {

    public void registerUser(User user) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String date = sdf.format(user.getBirthday());
        String strSql = "insert into user_ (id,name,sex,birthday,password,description)\n" +
                "values ("+user.getId()+",'"+user.getName()+"','"+user.getSex()+"','"+date+"','"+user.getPasswd()+"','我是天才')";

        DBUtils.modifyTable(strSql);
    }

    public List<Map<String,Object>> getAlluser() {

        String sql = "select * from user_ ";
        List<Map<String,Object>> list = DBUtils.queryTable(sql);


        return list;
    }

    public boolean login(User user) {

        String strSql = "select * from user_ where name = '"+user.getName()+"' and PASSWORD = '"+user.getPasswd()+"'" ;
        List<Map<String,Object>> list = DBUtils.queryTable(strSql);

        boolean result = true;
        if (list == null || list.isEmpty()) {
            // 登录失败
            result = false;
        }

        return result;
    }
}
