class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        String ans = "";

        for(int j = 0; j < strs[0].length(); j++) {

            char word = strs[0].charAt(j);

            for(int i = 1; i < n; i++) {

                String str = strs[i];

                if(j >= str.length() || str.charAt(j) != word) {
                    return ans;
                }
            }

            ans = ans + word;
        }

        return ans;
    }
}