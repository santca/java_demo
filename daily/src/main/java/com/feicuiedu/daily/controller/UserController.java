package com.feicuiedu.daily.controller;

import com.feicuiedu.daily.pojo.User;
import com.feicuiedu.daily.service.UserService;
import com.feicuiedu.daily.uitl.FileUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chenyan on 2016/10/11.
 */
public class UserController {

    private Scanner scanner ;

    public UserController(Scanner scanner) {
        this.scanner = scanner;
    }

    /*public void showSelectItem() {
        String filePath = "E:\\git_project\\feicui\\jinan\\java_demo\\daily\\src\\main\\resources";

        String fileName = "welcome.txt";
        String welComeStr = FileUtils.readFile(filePath,
                fileName);
        System.out.println(welComeStr);

    }*/

    public void register() {

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

        UserService userService = new UserService();
        userService.registerUser(user);

        List<Map<String ,Object>> list = userService.getAlluser();

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

    public boolean login() {
        User user = null;
        UserService userService = new UserService();

        boolean loginResult = false;
        while (true) {

            System.out.println("请输入姓名");
            String name = scanner.next();
            System.out.println("请输入密码");
            String password = scanner.next();

            user = new User(name,password);

            loginResult = userService.login(user);

            if (loginResult) {
                System.out.println("登录成功");


                break;

            }
            else {
                System.out.println("登录失败，姓名和密码不匹配");
            }
        }

        return loginResult;
    }

    public void showSelectItem(String filePath, String fileName) {

        String welComeStr = FileUtils.readFile(filePath,
                fileName);
        System.out.println(welComeStr);
    }

    public int selectedItem() {

        int selected = scanner.nextInt();


        return selected;
    }
}
