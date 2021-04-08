import java.util.*;
class res_arraylist
{
  public static void main(String aa[])
  {
     Scanner sc=new Scanner(System.in);
             String str=sc.nextLine();
             ArrayList lastAns=gss(str);

        System.out.println(lastAns);
  }
  public static ArrayList<String> gss(String s)
  {
	 //abc


	   if(s.length()==0)
	   {
		   ArrayList<String> temp_arlist=new ArrayList();
		   temp_arlist.add("");
		   return temp_arlist;
		}
	 char ch=s.charAt(0);//first element[a]
	 String rofstr=s.substring(1);//rest of String[bc]
	 ArrayList<String> a2=gss(rofstr);//c

	 ArrayList<String> ans=new ArrayList();//ans

	 for(String sans:a2)
	 {
		 ans.add(sans);
	 }

	 	 for(String sans:a2)
	 	 {
	 		 ans.add(sans+ch);
	 }
	 return ans;

  }
}
