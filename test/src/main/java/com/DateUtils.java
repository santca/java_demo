package com;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by chenyan on 2016/9/26.
 */
public class DateUtils {

    public static List<String> getDaysBetween(String beginDate, String endDate) {
        String[] beginArray = beginDate.split("-");
        String[] endArray = endDate.split("-");

        int beginYear = Integer.valueOf(beginArray[0]);
        int beginMonth = Integer.valueOf(beginArray[1])-1;
        int beginDayOfMonth = Integer.valueOf(beginArray[2]);

        int endYear = Integer.valueOf(endArray[0]);
        int endMonth = Integer.valueOf(endArray[1])-1;
        int endDayOfMonth = Integer.valueOf(endArray[2]);

        List<String> listDays = new ArrayList<String>();

        Calendar beginCalendar = Calendar.getInstance();
        beginCalendar.set(beginYear,beginMonth,beginDayOfMonth);
        listDays.add(formatDate(beginCalendar));
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(endYear,endMonth,endDayOfMonth);

        while (true) {
            beginCalendar.add(Calendar.DAY_OF_MONTH,1);

            if (beginCalendar.get(Calendar.DAY_OF_WEEK) == 1||beginCalendar.get(Calendar.DAY_OF_WEEK) == 7) {
                continue;
            }
            String str = formatDate(beginCalendar);
            listDays.add(str);

            if (!beginCalendar.before(endCalendar)) {
                break;
            }
        }
        return listDays;
    }

    public static String formatDate(Calendar calendar) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(calendar.getTime());
    }
}
