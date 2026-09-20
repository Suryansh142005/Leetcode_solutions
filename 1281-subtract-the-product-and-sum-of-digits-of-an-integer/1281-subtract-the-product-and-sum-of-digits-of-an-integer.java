class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int length = String.valueOf(n).length();
        for (int i=1; i<=length; i++) {
            int rem = n%10;
            product *= rem;
            sum += rem;
            n = n/10;
        }
        int diff = product - sum;
        return diff;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna