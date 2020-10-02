package numerology.rules;

import java.util.Arrays;
import java.util.List;

import numerology.Memory;

public class RuleReplaceThree implements RuleInterface {
	public List<Integer> applyRule(List<Integer> input, Integer index) {
		Integer following = (index == input.size()-1) ? 0 : input.get(index + 1);
    	if (!following.equals(5) && (Memory.getThreesReplaced() <= Memory.getFoursReplaced()) 
    			&& Memory.getThreesReplaced() < 4 && !Memory.isLastThree()) {
    		Memory.incrementThreesReplaced();
    		Memory.setLastThree(true);
    		Memory.setLastFour(false);
    		return Arrays.asList(5);
    	} else {
    		return Arrays.asList(input.get(index));
    	}
	}
}
