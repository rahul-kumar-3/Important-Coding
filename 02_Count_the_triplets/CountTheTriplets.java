/*Count the triplets */
/*Given an array arr, count the number of distinct triplets (a, b, c) such that:

a + b = c

Each triplet is counted only once, regardless of the order of a and b.

Even if the same number appears multiple times in the array, a valid triplet should be counted only once per unique combination.

Input: arr[] = [1, 5, 3, 2] 
Output: 2 
Explanation: In the given array, there are two such triplets such that sum of the two numbers is equal to the third number, those are (1, 2, 3), (3, 2, 5)
 

Input: arr[] = [3, 2, 7]
Output: 0 
Explanation: In the given array there are no such triplets such that sum of two numbers is equal to the third number.  

*/
import java.util.*;
public class CountTheTriplets {

    public static int getResult(int[] arr){
        int count = 0;
        Set<Integer> temp = new HashSet<>();
        for(int val : arr){
            temp.add(val);
        }
        for(int i = 0; i < arr.length;i++){
            int sum = 0;
            for(int j = i+1; j < arr.length; j++){
                sum = arr[i] +arr[j];

                if( temp.contains(sum)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getResult(arr));

        sc.close();
    }
}
