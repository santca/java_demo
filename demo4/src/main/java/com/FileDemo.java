package com;

import java.io.File;
import java.io.IOException;

/**
 * Created by chenyan on 2016/9/29.
 */
public class FileDemo {

    public static void main(String[] args) {

        // 创建一个File对象
        File file = new File("E:\\tmp\\测试");

        // 判断 file 是文件夹还是文件
        boolean bln = file.isDirectory();
        boolean bln1 = file.isFile();

        // 修改文件夹是将文件夹改名
        file.renameTo(new File("E:\\tmp\\测试1"));

        // 获取file的名字
        System.out.println("文件的（绝对）路径:" + file.getAbsolutePath());
        System.out.println("文件的名字:" + file.getName());
        System.out.println("是否是目录：" + bln + "|是否是文件:" + bln1);

    }
}
