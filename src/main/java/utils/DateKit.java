package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateKit {
	private static SimpleDateFormat format; 
	
	public static String yyyyMMddHHmmss(Date date) {
		format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		return format.format(date);		
	}
	
	public static String yyyyMMdd(Date date) {
		format = new SimpleDateFormat( "yyyy-MM-dd");
		return format.format(date);		
	}
	
	public static Date yyyyMMddHHmmss(String dateStr) throws ParseException {
		format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		return format.parse(dateStr);		
	}
	
	public static Date yyyyMMdd(String dateStr) throws ParseException {
		format = new SimpleDateFormat( "yyyy-MM-dd");
		return format.parse(dateStr);		
	}
	
	public static String yyyyMMddHHmmss(Long timestamp){
		format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		return format.format(timestamp);		
	}
	
	public static String yyyyMMdd(Long timestamp){
		format = new SimpleDateFormat( "yyyy-MM-dd");
		return format.format(timestamp);		
	}
	
	public static Date timestampToDate(Long timestamp) throws ParseException{
		format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		return format.parse(yyyyMMddHHmmss(timestamp));		
	}
	
	public static Long dateToTimestamp(Date date) {
		return date.getTime();		
	}
	
//	private static final Logger log = LoggerFactory.getLogger(DateKit.class);
//
//	public static void main(String[] args) {
//		
//		
//	}
	

}
