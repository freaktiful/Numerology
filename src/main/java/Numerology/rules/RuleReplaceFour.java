package numerology.rules;

import java.util.Arrays;
import java.util.List;

import numerology.Memory;

public class RuleReplaceFour implements RuleInterface {
	public List<Integer> applyRule(List<Integer> input, Integer index) {
		Integer preceeded = (index == 0) ? 0 : input.get(index - 1);
    	if(!preceeded.equals(5) && (Memory.getFoursReplaced() <= Memory.getThreesReplaced()) 
    			&& Memory.getFoursReplaced() < 3 && !Memory.isLastFour()) {
    		Memory.incrementFoursReplaced();
    		Memory.setLastFour(true);
    		Memory.setLastThree(false);
    		return Arrays.asList(3);
    	} else {
    		return Arrays.asList(input.get(index));
    	}
	}
}