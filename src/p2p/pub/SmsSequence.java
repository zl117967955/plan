package p2p.pub;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.pattern.IntegerPatternConverter;

import com.mysql.jdbc.StringUtils;
  
public class SmsSequence {
	
	private String date = "";
	private int index = 0;

	public String getDate() {
		return date;
	}

	public int getIndex() {
		return index;
	}



	public void build(){
		
		//build date
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(new Date());
		rightNow.add(Calendar.HOUR, -1);
		Date latestTime = rightNow.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		date = sdf.format(latestTime);
		
		//build index
		SimpleDateFormat formatH = new SimpleDateFormat("HH");
		index = Integer.parseInt(formatH.format(latestTime));
	}

}
