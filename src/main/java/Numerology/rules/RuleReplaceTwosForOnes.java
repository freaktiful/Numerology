package numerology.rules;

import java.util.ArrayList;
import java.util.List;

public class RuleReplaceTwosForOnes implements RuleInterface {  	
	public List<Integer> applyRule(List<Integer> input, Integer index) {
		List<Integer> output = new ArrayList<Integer>();
		for(int j=0; j<input.get(index-1); j++) {
			output.add(1);
		}
		return output;
	}
}