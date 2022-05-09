package com.azureguardian.problems.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTests {

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     */
    @Test
    public void duplicateFound() {
        int[] nums1 = {1, 2, 3, 1};
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(nums1));

        int[] nums2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(nums2));
    }

    @Test
    public void duplicateNotFound() {
        int[] nums = {1, 2, 3, 4};
        Assertions.assertFalse(new ContainsDuplicate().containsDuplicate(nums));
    }
}
