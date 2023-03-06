# Kth Missing Positive Number
 
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array. 

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 

Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length

# Explanation

This is a relatively easy problem. Here's one possible approach to solving this problem:

1. Initialize a variable count to 0 and a variable i to 0.
2. While count < k, check if i is in the array arr.
3. If i is not in arr, increment count.
4. If count == k, return i.
5. Otherwise, increment i and repeat from step 2.

This approach works by checking each integer starting from 1 to see if it is in the array arr, and counting the number of missing positive integers encountered so far. Once the kth missing positive integer is found, the algorithm returns it.

This approach has a time complexity of O(n) in the worst case, where n is the length of the input array arr, since we may need to check every integer up to the kth missing positive integer. However, since the array is sorted in non-decreasing order, we can potentially optimize this algorithm by using binary search to find the kth missing positive integer in O(log n) time.

Note that we use a 0-based index to access elements in the array, so we check if i > n to handle the case where we have exhausted all elements in the array. Also, we check if i != arr[i-1] to see if the current integer i is missing from the array. We return -1 if we cannot find the kth missing positive integer in the array.
