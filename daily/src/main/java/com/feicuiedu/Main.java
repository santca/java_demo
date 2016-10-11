package com.feicuiedu;

import com.feicuiedu.daily.controller.UserController;

import java.util.Scanner;

/**
 * Created by chenyan on 2016/10/10.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController(scanner);

        String filePath = "E:\\git_project\\feicui\\jinan\\java_demo\\daily\\src\\main\\resources";

        String fileName = "welcome.txt";

        userController.showSelectItem(filePath, fileName);

        int selected = userController.selectedItem();

        boolean loginResult = false;

        if (1 == selected) {

            // 登录
            loginResult = userController.login();
        }
        else {

            // 注册
            userController.register();
        }

        // 登录成功后的操作
        if (loginResult) {

            fileName = "operate_item.txt";

            userController.showSelectItem(filePath, fileName);

            selected = userController.selectedItem();


        }
        else {

        }

        switch (selected){
            case 1:
                // 查看日报
                break;
            case 2:
                // 新增日报
                break;
            case 3:
                // 退出
                break;
            default:
                System.out.println("系统错误");
                System.exit(-1);
        }
    }
}
