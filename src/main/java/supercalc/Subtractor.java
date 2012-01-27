package supercalc;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class Subtractor {

	private Logger log = Logger.getLogger(getClass());
	
	public Integer subtract(Integer op1, Integer op2) {
		log.info("substracting " + op1 + " from " + op2);
		return op1 - op2; 
	}
	
	
}
