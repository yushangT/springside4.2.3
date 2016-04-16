package org.springside.examples.quickstart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
		applicationContext.load("applicationContext-jetty.xml");
		applicationContext.refresh();
		logger.info(applicationContext.getApplicationName() + "start ok.");
	}
}
