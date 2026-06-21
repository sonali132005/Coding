class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            String temp = "";

            for(int j = i; j < s.length(); j++) {
                if(temp.indexOf(s.charAt(j)) != -1) {
                    break;
                }
                temp += s.charAt(j);
            }

            maxLen = Math.max(maxLen, temp.length());
        }

        return maxLen;
    }
}