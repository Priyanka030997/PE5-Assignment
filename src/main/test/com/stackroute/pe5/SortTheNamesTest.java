package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class SortTheNamesTest {
    SortTheNames obj;
    @Before
    public void setup() {
        obj = new SortTheNames();
    }

    @Test
    public void Sortthenamesingivenstring() {
        String input[] = {"Harry", "Olive", "Alice" ,"Bluto", "Eugene"};
        ArrayList<String> result = obj.SortThegivenNames(input);
        ArrayList<String> output=new ArrayList<>();
        output.add("Alice");
        output.add("Bluto");
        output.add("Eugene");
        output.add("Harry");
        output.add("Olive");
        assertEquals(output, result);

    }

}