import org.apache.log4j.Logger;

public class LoggingExampleTest {

	public static void main(String[] args) {

		// add log4j.jar
		//add log5j.properties directly inside the src folder
		// create the object in the code
		
		Logger APPLICATIONS_LOGS = Logger.getLogger("devpinoyLogger");
		APPLICATIONS_LOGS.debug("hello");
		APPLICATIONS_LOGS.debug("We are writing in to a log file");
		APPLICATIONS_LOGS.debug("starting the test case xyz test");
		APPLICATIONS_LOGS.debug("starting the test case xyz test");
		
		
		
	}

}
