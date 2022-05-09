package com.azureguardian.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countForEachNum = new HashMap<>(nums.length);
        for (int num : nums) {
            if (countForEachNum.containsKey(num)) {
                return true;
            }
            countForEachNum.put(num, 1);
        }
        return false;
    }
}
