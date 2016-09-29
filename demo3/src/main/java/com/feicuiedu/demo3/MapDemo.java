package com.feicuiedu.demo3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by chenyan on 2016/9/28.
 */
public class MapDemo {

    public static void main(String[] args) {

        // 创建
        Map<String,String> countries = new HashMap<String, String>();

        // 对map添加输入
        countries.put("CN", "中华人民共和国");
        countries.put("RU", "俄罗斯联邦");
        countries.put("FR", "法兰西共和国");
        countries.put("US", "美利坚合众国");

        // 查询
        String country = countries.get("CN");

        // 遍历
        // 使用Map.Entry<String, String>
        Set<Map.Entry<String, String>> set = countries.entrySet();
        Iterator<Map.Entry<String,String>> it = set.iterator();

        while(it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            // json标准
            System.out.println(key+":"+value+",");
        }

        System.out.println("******************************222");

        // 删除
        //countries.remove("US");

        // 使用keySet 遍历
        Set<String> setKey = countries.keySet();
        Iterator<String> itKey = setKey.iterator();
        while(itKey.hasNext()) {
            String key = itKey.next();
            String value = countries.get(key);

            System.out.println(key+":"+value+",");
        }

        System.out.println("******************************333");

        for (Map.Entry<String,String> entry: countries.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            // json标准
            System.out.println(key+":"+value+",");
        }

        boolean bln = countries.containsKey("ccc");
        boolean bln1 = countries.containsValue("美利坚合众国");

        System.out.println("bln="+bln+" bln1="+bln1);
       /* System.out.println("CN对应的国家是：" + country);
        System.out.println("Map中共有" + countries.size() + "组数据");*/
    }
}
