package org.king.life_counter.utils;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class DateFormatConverter {
    private static final String PATTERN_MYSQL = "yyyy-MM-dd HH:mm:ss.S";
    private static final String PATTERN_VO = "yyyy.MM.dd";
 
    private static DateTimeFormatter FORMATTER_MYSQL = DateTimeFormatter.ofPattern(PATTERN_MYSQL);
    private static DateTimeFormatter FORMATTER_VO = DateTimeFormatter.ofPattern(PATTERN_VO);
 
    public static String convertDateTime(String mysqlformat) {
        LocalDateTime dateTime = LocalDateTime.parse(mysqlformat, FORMATTER_MYSQL);
        return dateTime.format(FORMATTER_VO);
    }
}