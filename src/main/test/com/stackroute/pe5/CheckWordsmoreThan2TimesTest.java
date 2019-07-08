package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckWordsmoreThan2TimesTest {
    CheckWordsmoreThan2Times obj;

    @Before
    public void setup() {
        obj = new CheckWordsmoreThan2Times();
    }

    @Test
    public void UpdateArrayElementWithother() {
        String input[] = {"a","b","c","d","a","c","c"};
        HashMap<String, Boolean> result = obj.CheckWord(input);
        HashMap<String, Boolean> output = new HashMap<String, Boolean>();
        output.put("a", true);
        output.put("b", false);
        output.put("c", true);
        output.put("d", false);
        assertEquals(output, result);

    }

}