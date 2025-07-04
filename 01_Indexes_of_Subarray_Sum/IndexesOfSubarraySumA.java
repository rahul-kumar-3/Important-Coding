/*Indexes of Subarray Sum */
/*Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].

Examples:

Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
Output: [1, 5]
Explanation: The sum of elements from 1st to 5th position is 15.
Input: arr[] = [5, 3, 4], target = 2
Output: [-1]
Explanation: There is no subarray with sum 2.

Time Complexity O(n) */
import java.util.*;
public class IndexesOfSubarraySumA {

    public static ArrayList<Integer> getSubArray(int[] arr, int target){
        ArrayList<Integer> res = new ArrayList<>();
        int e = 0, s = 0;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];

            //If current sum becomes more or equal
            //set end try adjusting start
            if(currSum >= target){
                e = i;

                  // While current sum is greater, 
                // remove starting elements of current window
                while (currSum > target && s < e) {
                    currSum -= arr[s];
                    ++s;
                }

                // If we found subaaray
                if(currSum == target){
                    res.add(s+1);
                    res.add(e+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();  //size of the array
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();  // Taking input of the array
        }

        int target = sc.nextInt();  // target sum

        ArrayList<Integer> res = getSubArray(arr, target);
        for(int ans : res){
            System.out.print(ans+" ");
        }

        sc.close();
    }
}
