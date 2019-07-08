package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CountWordsinString {
    public HashMap<String,Integer> CountwordsingivenString(String str)
    {
         //str="one one -one___two,,three,one @three*one?two";
        String arr[]=str.split("[\\W_\\s]+");
        HashMap<String, Integer> result= new HashMap<String, Integer>();
     for(String input:arr)
     {
         if(result.containsKey(input))
         {
             result.put(input, result.get(input) + 1);
         }
         else
         {
             result.put(input,1);
         }
     }
       // for (Map.Entry entry : result.entrySet()) {
           // System.out.print(entry.getKey() + ":" + entry.getValue()+" ");
        //}
        return result;

    }
}
