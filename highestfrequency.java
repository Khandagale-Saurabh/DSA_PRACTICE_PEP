import java.util.*;
// aabcbbcbd
class highestfrequency
{
 public static void main(String aa[])
  {
   Scanner sc=new Scanner(System.in);
   HashMap<Character,Integer> h1=new HashMap();
     String str=sc.nextLine();

    for(int i=0;i<str.length();i++)
    {

	  char ch=str.charAt(i);
	  int c=1;
	  if(h1.containsKey(ch))
	  {
         int u=h1.get(ch);
	    h1.put(ch,++u);
	   }
	   else
	   {

		h1.put(ch,c);
		}
	}
int max=Integer.MIN_VALUE;
String ch="";
for(Character k:h1.keySet())
    {
	  int y=h1.get(k);
	  if(y>max)
	  {
	   max=y;
	    ch=""+k;
	  }
    }
System.out.println(ch);

  }



}
