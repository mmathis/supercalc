package supercalc;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Multiplies two numbers of type integer
 */
@Service
public class Multiplicator {

	private Logger log = Logger.getLogger(getClass());
	
	public Integer add(Integer op1, Integer op2) {
		log.info("multiplying " + op1 + " with " + op2);
		Integer result = op1 * op2;
		
		log.info("result: " + result);
		return result;
	}
	
	
}
