/*Kadane's Algorithm */
/*You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25. */

import java.util.*;
public class KadanesAlgorithm {

    public static int getMaxSumOfSubarry(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
       for(int i = 0; i < arr.length; i++){
        currSum += arr[i];
        maxSum = Math.max(maxSum, currSum);

        if(currSum < 0){
            currSum = 0;
        }
       }
        return maxSum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getMaxSumOfSubarry(arr));
        sc.close();

    }
}
