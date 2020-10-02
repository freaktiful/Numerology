package numerology.rules;

import java.util.Arrays;
import java.util.List;

public class NoRule implements RuleInterface {
	public List<Integer> applyRule(List<Integer> input, Integer index) {
		return Arrays.asList(input.get(index));
	}
}
