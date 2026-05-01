import java.util.Scanner;

class Solution {

    public static boolean isSameAfterReversals(int num) {
        int original = num;

        int reversed = 0;

        // reverse number
        while (num != 0) {
            int d = num % 10;
            reversed = reversed * 10 + d;
            num = num / 10;
        }

        // reverse again
        int num2 = reversed;
        int reversedAgain = 0;

        while (num2 != 0) {
            int d = num2 % 10;
            reversedAgain = reversedAgain * 10 + d;
            num2 = num2 / 10;
        }

        return original == reversedAgain;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // ✅ Direct call (no object)
        boolean result = isSameAfterReversals(num);

        System.out.println(result);
    }
}