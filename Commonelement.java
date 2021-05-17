import java.io.*;
import java.util.*;

public class Commonelement{

public static void main(String[] args) throws Exception
 {
     Scanner sc=new Scanner(System.in);
     int n1=sc.nextInt();
     int a1[]=new int[n1];
      for(int i=0;i<n1;i++)
	     {
	         a1[i]=sc.nextInt();
    }
     int n2=sc.nextInt();
     int a2[]=new int[n2];


     for(int i=0;i<n2;i++)
    {
        a2[i]=sc.nextInt();
    }

  HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();

  for(int i=0;i<n1;i++)
  {

     if(h1.containsKey(a1[i]))
     {
	    int y=h1.get(a1[i]);
	   h1.put(a1[i],++y);
	  }
	  else
	  {
	    h1.put(a1[i],1);
	   }
  }
  System.out.println(h1);

  //frequency
  for(int i:a2)
  {

  System.out.println(i);
  }

}

}


/*
if( h1.containsKey(a2[i]) && h1.get(i)>0 )
    {
	 int y=h1.get(i);
	  h1.put(a2[i],y--);


	}
*/
