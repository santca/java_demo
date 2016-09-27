package com;

import java.io.*;
import java.util.List;

/**
 * Created by chenyan on 2016/9/26.
 */
public class Test {

    public static void main(String[] args) {

        // 生成日报
        genDayReport("2016-09-01","2016-10-31");

        // 生成周报
        genWeekReport();
    }

    public static void genDayReport(String strBeginDate, String strEndDate) {
        List<String> listDays = DateUtils.getDaysBetween(strBeginDate,strEndDate);

        List<String> listNames = FileUtils.getNames();

        //String path = "F:\\doument\\翡翠\\svn_data\\android06\\docment\\行政管理\\日报";
        String path = "E:\\git_project\\fishcy521_private\\daily";




        for (String day :listDays) {
            String dayDirc = path+"\\办公\\日报\\"+day;
            File fileDay = new File(dayDirc);

            if (!fileDay.exists()) {
                fileDay.mkdirs();
            }

            for (String name:listNames) {
                File fileDoc = new File(fileDay,name+"-"+day+".doc");
                if(!fileDoc.exists()) {
                    try {
                        fileDoc.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            dayDirc = path+"\\私用\\日报\\"+day;
            fileDay = new File(dayDirc);

            if (!fileDay.exists()) {
                fileDay.mkdirs();
            }

            for (String name:listNames) {
                File fileDoc = new File(fileDay,name+"-"+day+".md");
                if(!fileDoc.exists()) {
                    try {
                        fileDoc.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void genWeekReport() {

    }
}
