package supercalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Extensible calculator
 */
@Service
public class Calculator {

	@Autowired
	private Adder adder;
	
	@Autowired
	private Subtractor sub;
	
	public void runLoop() throws IOException {
		
		while(true) {
			BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
			
			System.out.println("Welcome to supercalc");
			System.out.println("enter command:");
			String line = br.readLine();
			
			if (line.equals("e")) {
				System.out.println("good bye, have a nice day...");
				break;
			} else {
				String[] args = line.split(" ");
				if (args.length == 3) {
					String opCode = args[0];
					Integer op1 = Integer.parseInt(args[1]);
					Integer op2 = Integer.parseInt(args[2]);
					
					if (opCode.equals("+")) {
						System.out.println("result: " + adder.add(op1, op2));
					} else if (opCode.equals("-")) {
						System.out.println("result: " + sub.subtract(op1, op2));
					}
				}
			}
		}
		
	}
	
	

}
