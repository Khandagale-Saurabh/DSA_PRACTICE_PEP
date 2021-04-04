 public static void rearrange(int arr[], int n)
    {
       // ArrayList<Integer> a1=new ArrayList();
          ArrayList<Integer> a2=new ArrayList();
      int temp[]=arr.clone();
      int len=temp.length;
      int lg=len-1;
      int small=0;
      boolean flag=true;
      for(int i=0;i<len;i++)
      {
       
        if(flag)
        {
          arr[i]=temp[lg--];
            
        }
         else{ arr[i]=temp[small++];}
         flag=!flag;
        
      }
      
     
