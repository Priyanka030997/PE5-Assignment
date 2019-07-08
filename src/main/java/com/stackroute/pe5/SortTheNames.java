package com.stackroute.pe5;

import java.util.*;

public class SortTheNames {
    public ArrayList<String> SortThegivenNames(String arr[])
    {
        //HashSet<String> input = new HashSet<String>();
        TreeSet<String> input = new TreeSet<String>();

      for(String word:arr)
      {
          input.add(word);
      }
        //Iterator iterator = input.iterator();
       // while (iterator.hasNext()) {
           // System.out.print(iterator.next()+" ");
       // }
        //System.out.println();
        ArrayList <String> result=new ArrayList<String>(input);
       // Iterator iterator1=result.iterator();
       // while(iterator1.hasNext())
       // {
        //    System.out.print(iterator1.next()+" ");
       // }
        return result;
    }
}
