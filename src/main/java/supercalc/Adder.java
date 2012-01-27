package supercalc;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service

public class Adder {

	private Logger log = Logger.getLogger(getClass());
	
	public Integer add(Integer op1, Integer op2) {
		log.info("adding " + op1 + " and " + op2);
		return op1 + op2; 
	}
	
	
}
