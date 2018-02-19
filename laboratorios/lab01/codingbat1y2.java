public class codingbat1y2{
    /**
    ejercicios recursion 1 laboratorio 
     */

    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    /**
    ejercicios recursion 2 laboratorio 
     */

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        if (nums[start] == 6){
            return groupSum6(start + 1, nums, target - nums[start]);
        }else{
            return groupSum6(start + 1, nums, target - nums[start])
            || groupSum6(start + 1, nums, target);
        }
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        return groupNoAdj(start + 2, nums, target - nums[start])
        || groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        if (nums[start] % 5 == 0) {
            if (start < nums.length - 1 && nums[start + 1] == 1){
                return groupSum5(start + 2, nums, target - nums[start]);
            }else{
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }else{
            return groupSum5(start + 1, nums, target - nums[start])
            || groupSum5(start + 1, nums, target);
        }
    }


    public boolean splitArray(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) return sum1 == sum2;
        return helper(start + 1, nums, sum1 + nums[start], sum2)
        || helper(start + 1, nums, sum1, sum2 + nums[start]);
    }


    public boolean splitOdd10(int[] nums) {
        return helper2(0, nums, 0, 0);
    }

    private boolean helper2(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length){
            return sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1
            && sum2 % 10 == 0;
        }else{
            return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
        }

    }
}
