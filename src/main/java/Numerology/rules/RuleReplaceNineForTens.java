package numerology.rules;

import java.util.Arrays;
import java.util.List;

public class RuleReplaceNineForTens implements RuleInterface {    	
	public List<Integer> applyRule(List<Integer> input, Integer index) {
		return Arrays.asList(10, 10);
	}
}
