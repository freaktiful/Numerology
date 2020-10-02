package numerology.rules;

import java.util.Arrays;
import java.util.List;

import numerology.Memory;

public class RuleSevenResetsRuleThreeAndFour implements RuleInterface {
	public List<Integer> applyRule(List<Integer> input, Integer index) {
		Memory.resetThreesReplaced();
		Memory.resetFoursReplaced();
		Memory.setLastFour(false);
		Memory.setLastThree(false);
		return Arrays.asList(input.get(index));
	}
}