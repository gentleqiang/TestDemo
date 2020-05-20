package com.debug.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.logging.SimpleFormatter;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月13日 上午11:13:43
*/
public class TestDate {
     public static void main(String[] args) {
		
		/*
		 * LocalDateTime now = LocalDateTime.now();
		 * System.out.println(now.toString().replace("T", " "));
		 */
		
    	 
		/*
		 * LocalDate now = LocalDate.now(); System.out.println(now);
		 */
    	 
    	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");
    	 System.out.println(sdf+".....");
    	 Calendar instance = Calendar.getInstance();
    	 System.out.println(instance+".....");
    	 instance.add(Calendar.DATE, -7);
    	 Long time = instance.getTime().getTime();
    	 System.out.println(time+".....");
    	 String format = sdf.format(time);
    	 System.out.println(format);
	}
}
