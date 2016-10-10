package com.feicuiedu;

import com.feicuiedu.daily.pojo.User;
import com.feicuiedu.daily.service.UserManager;
import com.feicuiedu.daily.uitl.FileUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chenyan on 2016/10/10.
 */
public class Main {

    public static void main(String[] args) {

        String filePath = "E:\\git_project\\feicui\\jinan\\java_demo\\daily\\src\\main\\resources";
        String fileName = "welcome.txt";
        String welComeStr = FileUtils.readFile(filePath,
                fileName);
        System.out.println(welComeStr);
        Scanner scanner = new Scanner(System.in);

        int selected = scanner.nextInt();

        if (1 == selected) {
            // 登录
        } else {
            // 注册

            System.out.println("请输入姓名");
            String name = scanner.next();

            System.out.println("请输入性别(0:女  1:男)");
            int sex = scanner.nextInt();

            System.out.println("请输入出入年月日(yyyy-MM-dd)");
            String dateStr = scanner.next();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = null;
            try {
                birthday = sdf.parse(dateStr);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
            String password = "";

            String confirmPasswrod = "";

            while (true) {

                System.out.println("请输入密码");
                password = scanner.next();

                System.out.println("请输入确认密码");
                confirmPasswrod = scanner.next();

                if (password.equals(confirmPasswrod)) {
                    break;
                }
            }

            long id = System.currentTimeMillis();
            User user = new User(name,
                    sex,
                    birthday,
                    password,
                    id);

            UserManager userManager = new UserManager();
            userManager.registerUser(user);

            List<Map<String ,Object>> list = userManager.getAlluser();

            System.out.println("目前系统所有的用户清单如下：");

            for (Map<String,Object> map:list) {


                for (Map.Entry<String,Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();

                    System.out.print(key+":"+value+",");
                }

                System.out.println();
            }
        }
    }
}
