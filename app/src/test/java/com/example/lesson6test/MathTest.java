package com.example.lesson6test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    private Math math;

    @Before
    public void setUp(){
        math = new Math();
        System.out.println("Before");
    }


    @Test
    public void add(){
        assertEquals(7,math.add(2,5));
        System.out.println("add");
    }

    @Test
    public void sub(){
        assertEquals(5,math.sub(10,5));
        System.out.println("sab");
    }

    @Test
    public void divZeroA(){
        assertEquals(0, math.div(5,0));
        System.out.println("divByZero");
    }    @Test
    public void divZeroB(){
        assertEquals(0, math.div(0,2));
        System.out.println("divByZero");
    }

    @Test
    public void reverseTwoWords(){
        assertEquals("Word Hello",math.reverse("Hello World"));
        System.out.println("reverseTwoWords");
    }

    @Test
    public void reverseThreeWords(){
        assertEquals("Three Two One",math.reverse("One Two Threee"));
        System.out.println("reverseThreeWords");
    }
    @Test
    public void reverseCommaWords(){
        assertEquals("Three,Two,One",math.reverse("One,Two,Threee"));
        System.out.println("reverseThreeWords");
    }

    @After
    public void tearDown(){
        math = null;
        System.out.println("after");
    }
}
