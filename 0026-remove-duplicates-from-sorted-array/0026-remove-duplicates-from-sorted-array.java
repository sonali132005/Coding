import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            num.add(nums[i]);
        }

        Set<Integer> set = new LinkedHashSet<>(num);

        int i = 0;

        for(int x : set) {
            nums[i] = x;
            i++;
        }

        return set.size();
    }
}