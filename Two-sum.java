import java.util.*;
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int z = 0;
        int b[] = new int[0];
        for(int i=0;i<nums.length;i++)
        {
           for(int j=0;j<nums.length;j++)
           {
               if(i!=j)
               {
                   if(nums[i]+nums[j] == target)
                   {
                       int a[] = new int[2];
                       a[0]=i;
                       a[1]=j;  
                           return a;
                   }
               }
           }
        }
        
        return b;
    }
    
    
}