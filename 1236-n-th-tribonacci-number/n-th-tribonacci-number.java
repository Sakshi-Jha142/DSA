class Solution {
    public int tribonacci(int n) {
        // Base case
        if (n < 3) {
            if (n == 0)
                return 0;
            else
                return 1;
        }

        int first = 0;
        int second = 1;
        int third = 1;
        int curr = 0;

        for (int i = 3; i <= n; i++) {
            curr = first + second + third;
            first = second;
            second = third;
            third = curr;
        }

        return curr;
    }
}

// TC: O(N), SC: O(1)