/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Custom;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author phanh
 */
public class ForJSP {

    public int getYear(Date date) {
        return date.getYear() + 1900;
    }

    public String formarNumberFloat(float number) {
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(number);
    }
    
    public String getDateFormat(String pattern, Date date){
        SimpleDateFormat f = new SimpleDateFormat(pattern);
        return f.format(date);
    }
}
