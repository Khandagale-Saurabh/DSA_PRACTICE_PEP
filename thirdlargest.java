class Solution {
    public int thirdMax(int[] nums) {
        ArrayList a1=new ArrayList();
        int ans=0;
       for(int i=0;i<nums.length;i++)
       {   int n1=nums[i];     
           if(!a1.contains(n1))
                {
                    a1.add(n1);
                }
       }
     Collections.sort(a1);
        System.out.println(a1);
         int last=a1.size()-1;
        if(a1.size()<3)
        {
         
            ans=(int)a1.get(last);
        }
        else
        {
            ans=(int)a1.get(last-2);
        }
        return ans;
    }
}
