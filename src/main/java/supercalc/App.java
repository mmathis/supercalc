package supercalc;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


public class App 
{
	@Autowired
    private Calculator calculator;

	private final static Logger LOG = Logger.getLogger(App.class);
	
    public static void main(String[] args) throws IOException {
    	App main = new App();
        ApplicationContextLoader loader = new ApplicationContextLoader();
        loader.load(main, "applicationContext.xml");
        
        LOG.info("entering main loop ---------------------------------");
        main.calculator.runLoop();
        LOG.info("exiting... ---------------------------------");

        System.exit(0);
    }

}
