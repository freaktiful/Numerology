/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Numerology;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class NumerologyTest {
    @Test 
    public void testReplaceEachNineForTwoTens() {
        Numerology numerology = new Numerology();
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,10,10,10), numerology.replaceEachNineForTwoTens(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
    }
    
    public class Numerology {
    	public List<Integer> replaceEachNineForTwoTens(List<Integer> in) {
            //return in.stream().map(o -> o == 9 ? 1 : o).collect(Collectors.toList());
    		List<Integer> out = new ArrayList<Integer>();
    		for (int i = 0; i< in.size(); i++) {
    			if (in.get(i).equals(9)) {
    				out.add(10);
    				out.add(10);
    			} else {
    				out.add(in.get(i));
    			}
    		}
    		return out;
        }
    }
}
