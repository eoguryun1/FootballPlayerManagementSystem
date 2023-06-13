package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler fileHandler;	
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {
			logmanager =LogManager.getLogManager();
			logger=logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fileHandler=new FileHandler(fileName);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void log(String logmessage) {
		logger.info(logmessage);
	}

}
