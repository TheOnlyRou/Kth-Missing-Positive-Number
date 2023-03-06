public class Solution {
    /// This solution is done using Binary search, to optimize the time complexity to O(logN)
    public int findKthPositive(int[] arr, int k) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - mid - 1;

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left + k;
    }

    public static void main(String[] args){
        int solution = new Solution().findKthPositive(new int[]{1, 5, 6, 8, 9, 10, 12, 13}, 15);
        int solution2 = new Solution().findKthPositive(new int[]{2, 3, 4, 7, 11}, 5);
        System.out.println("Solution = "+ Integer.toString(solution));
        System.out.println("Solution = "+ Integer.toString(solution2));
    }

}
