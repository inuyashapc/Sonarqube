/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Custom;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author phanh
 */
public class Common {
    public static Date getCurrentDate() {
        LocalDate curDate = java.time.LocalDate.now();
        return Date.valueOf(curDate.toString());
    }
    
    public static String getDateFormat(String pattern, Date date){
        SimpleDateFormat f = new SimpleDateFormat(pattern);
        return f.format(date);
    }
}
