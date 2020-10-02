package numerology.rules;

import java.util.ArrayList;
import java.util.List;

public class RuleReplaceSixsForThrees implements RuleInterface {
	public List<Integer> applyRule(List<Integer> input, Integer i) {
		List<Integer> output = new ArrayList<Integer>();
		Integer index = input.get(i-1);
		for (int j=0; j<input.get(i + index); j++) {
			output.add(3);
		}
		return output;
	}
}
