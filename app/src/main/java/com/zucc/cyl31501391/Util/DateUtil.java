package com.zucc.cyl31501391.Util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {
    //time->11:11
    public static String getFormattedTime(long timeStamp){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
       return formatter.format(new Date(timeStamp));
    }
    //time->2019-07-01
    public static String getFormattedDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new Date());
    }
}
