package com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyan on 2016/9/27.
 */
public class FileUtils {

    public static List<String> getNames() {

        List<String> list = new ArrayList<String>();

        try {

            InputStream is = Class.forName("com.Test").getResourceAsStream("/name.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String name = "";
            while(name != null) {
                // System.out.println(name);
                if (name != null && !"".equals(name)) {
                    list.add(name);
                }

                name = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
