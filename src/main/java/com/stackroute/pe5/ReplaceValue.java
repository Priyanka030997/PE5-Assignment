package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;


public class ReplaceValue {
    public String Replacevaluewithothervalue(Map<String,String> input)
    {
        if(input==null)
        {
            return null;
        }
        String temp=input.get("val1");
        input.put("val2",temp);
        input.put("val1"," ");
        return input.toString();

    }

}
