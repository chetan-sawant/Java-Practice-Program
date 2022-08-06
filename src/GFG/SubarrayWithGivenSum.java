package GFG;
//{ Driver Code Starts
import java.util.*;
        import java.lang.*;
        import java.io.*;

class SubarrayWithGivenSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int sum=arr[0],start=0;
        boolean flag=false;
        for(int i=1;i<=n;i++) {
            while(sum>s &&  start<i-1) {
                sum-=arr[start];
                start++;
            }
            if(sum == s) {
                ArrayList<Integer> returnList = new ArrayList<Integer>();
                returnList.add(start+1);
                returnList.add(i);

                return returnList;

            }
            if(i<n)
                sum+=arr[i];
        }

        return null;
    }
}

//Problem Name
//Subarray with given sum

//input
/*

    For Input:
        5 12
        1 2 3 7 5
        Your Output:
        2 4
        Expected Output:
        2 4
*/
