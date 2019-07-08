package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountWordsinStringTest {
    CountWordsinString obj;

    @Before
    public void setup() {
        obj = new CountWordsinString();
    }

    @Test
    public void UpdateArrayElementWithother() {
        String input = "one one -one___two,,three,one @three*one?two";
        HashMap<String, Integer> result = obj.CountwordsingivenString(input);
        HashMap<String, Integer> output = new HashMap<String, Integer>();
        output.put("one", 5);
        output.put("two", 2);
        output.put("three", 2);
        assertEquals(output, result);

    }
    @Test
    public void UpdateArrayElementWithotherelement() {
        String input = "one one #four&five-four+one";
        HashMap<String, Integer> result = obj.CountwordsingivenString(input);
        HashMap<String, Integer> output = new HashMap<String, Integer>();
        output.put("one", 3);
        output.put("four", 2);
        output.put("five", 1);
        assertEquals(output, result);

    }
}