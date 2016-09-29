package com.feicuiedu.demo3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by chenyan on 2016/9/28.
 */
public class MapDemo1 {

    public static void main(String[] args) {

        // 创建
        Map<Student,String> countries = new HashMap<Student, String>();

        // 对map添加输入
        countries.put(new Student(), "中华人民共和国");
        countries.put(new Student(), "俄罗斯联邦");
        countries.put(new Student(), "法兰西共和国");
        countries.put(new Student(), "美利坚合众国");

        // 查询
        String country = countries.get("CN");

        // 遍历
        // 使用Map.Entry<String, String>
        Set<Map.Entry<Student, String>> set = countries.entrySet();
        Iterator<Map.Entry<Student,String>> it = set.iterator();

        while(it.hasNext()) {
            Map.Entry<Student,String> entry = it.next();
            Student key = entry.getKey();
            String value = entry.getValue();
            // json标准
            System.out.println(key+":"+value+",");
        }

        System.out.println("******************************");

        // 删除
        //countries.remove("US");

        // 使用keySet 遍历
        Set<Student> setKey = countries.keySet();
        Iterator<Student> itKey = setKey.iterator();
        while(itKey.hasNext()) {
            Student key = itKey.next();
            String value = countries.get(key);

            System.out.println(key+":"+value+",");
        }

        boolean bln = countries.containsKey("ccc");
        boolean bln1 = countries.containsValue("美利坚合众国");

        System.out.println("bln="+bln+" bln1="+bln1);
       /* System.out.println("CN对应的国家是：" + country);
        System.out.println("Map中共有" + countries.size() + "组数据");*/
    }
}
