
package interestCalculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static final Logger logger = LogManager.getLogger(SimpleInterest.class.getName());
	
	public double SimpleInterestCalculator(double principle, double time, double rate) {
		logger.info("Simple Interest is being calculated");
		return (principle*time*rate)/100;
	}
}
