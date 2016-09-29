package com.feicuiedu.demo3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by chenyan on 2016/9/28.
 */
public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int index = it.next();
            System.out.println(index);
        }

    }
}
