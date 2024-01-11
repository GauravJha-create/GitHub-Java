/*You are given two positive integers n and k. A factor of an integer n is defined as an integer 
i where n % i == 0.Consider a list of all factors of n sorted in ascending order, return the kth
factor in this list or return -1 if n has less than k factors.
Example 1:
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.

AMAZON PROBLEM LEETCODE*/

class Solution {
    public int kthFactor(int n, int k) {
        int[] fact=new int[50];
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fact[count]=i;
                count++;
            }
            else
            continue;
        }
        int size=fact.length;
        for(int i=0;i<size;i++){
            if(fact[i]!=0){
                System.out.print(fact[i]+" ");
            }
            else
            break;
        }
        System.out.println();

        if(fact[k-1]!=0){
            System.out.println(fact[k-1]);
        }
        else {
        System.out.println("-1");
        }
        return 0;
    }


    public static void main(String args[])
    {
        Solution sol=new Solution();
        sol.kthFactor(12,3);
        sol.kthFactor(7,2);
        sol.kthFactor(4,4);
    }
}