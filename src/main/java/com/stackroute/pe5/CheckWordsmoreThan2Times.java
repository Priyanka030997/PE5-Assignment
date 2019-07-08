package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CheckWordsmoreThan2Times {
    public HashMap<String,Boolean> CheckWord(String arr[])
    {

        //String arr[]={"a","b","c","d","a","c","c"};
        HashMap<String, Boolean> result= new HashMap<String, Boolean>();
        for(String input:arr)
        {
            if(result.containsKey(input))
            {

                    result.put(input,true);
            }
            else
            {
                result.put(input,false);
            }
        }
        //for (Map.Entry entry : result.entrySet()) {
            //System.out.print(entry.getKey() + ":" + entry.getValue()+",");
        return result;

    }
}


