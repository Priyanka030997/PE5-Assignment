package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    Student obj;

    @Before
    public void setUp() {
        System.out.println("Before");

    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test

    public void givenArrayListReturnsFalseWhenGivenEmptyString() {

        List<Student> al = new ArrayList<>();

        // create customer objects using constructor initialization
        Student obj1 = new Student(10,"harika",22);
        Student obj2 = new Student(22,"sneha",23);
        Student obj3 = new Student(13,"ashritha",26);
        Student obj4 = new Student(18,"bhanu",12);
        Student obj5 = new Student(24,"sahithi",19);

        // add customer objects to ArrayList
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        Collections.sort(al,new StudentSorter());
        String expected="[StudentClass{id=18, name='bhanu', age=12}, StudentClass{id=24, name='sahithi', age=19}, StudentClass{id=10, name='harika', age=22}, StudentClass{id=22, name='sneha', age=23}, StudentClass{id=13, name='ashritha', age=26}]";
        assertEquals(expected, al.toString().trim());



    }

}