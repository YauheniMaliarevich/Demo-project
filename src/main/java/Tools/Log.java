package Tools;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Log {

	private static final Logger logger = Logger.getLogger(Log.class);
	
	public static void info(String info) {
		logger.log(Level.INFO, info);
	}
	
	public static void error(String error, Exception e) {
		logger.log(Level.ERROR, error, e);
	}
	
}
