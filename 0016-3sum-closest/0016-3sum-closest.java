class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int minDiff = Integer.MAX_VALUE;
        int closestSum = 0;

        for(int i = 0; i < nums.length - 2; i++) {

            for(int j = i + 1; j < nums.length - 1; j++) {

                for(int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if(Math.abs(target - sum) < minDiff) {

                        minDiff = Math.abs(target - sum);
                        closestSum = sum;
                    }
                }
            }
        }

        return closestSum;
    }
}