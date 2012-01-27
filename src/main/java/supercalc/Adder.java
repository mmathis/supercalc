package supercalc;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Adds two numbers
 */
@Service
public class Adder {

	private Logger log = Logger.getLogger(getClass());
	
	public Integer add(Integer op1, Integer op2) {
		log.info("adding " + op1 + " and " + op2);
		Integer result = op1 + op2;
		
		log.info("result: " + result);
		return result;
	}
	
	
}
