package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {
    UpdateArrayElement obj;
    @Before
    public void setup()
    {
        obj=new UpdateArrayElement();
    }
    @Test
    public void UpdateArrayElementWithother()
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        ArrayList<String> result=obj.UpdateElementWithOtherElement(list);
        ArrayList<String> output=new ArrayList<String>();
        output.add("kiwi");
        output.add("Grape");
        output.add("Mango");
        output.add("Berry");
        assertEquals(output,result);


    }

}