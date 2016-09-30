package com;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenyan on 2016/9/30.
 */
public class Test1 {

    public static  void  main(String[] args){

        File file = new File("config.txt");
        Map<String,String> configMap =new HashMap<String, String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String strLine = "";
            while(true) {

                strLine = br.readLine();
                if (strLine == null) {
                    break;
                }
                System.out.println(strLine);

                String[] lines = strLine.split("=");

                String key = lines[0];
                String value = lines[1];
                configMap.put(key,value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String,String> entry:configMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
