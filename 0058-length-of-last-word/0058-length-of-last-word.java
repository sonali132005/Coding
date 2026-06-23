class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;

        for (String word : s.split(" ")) {
            if (!word.equals("")) {
                len = word.length();
            }
        }

        return len;
    }
}