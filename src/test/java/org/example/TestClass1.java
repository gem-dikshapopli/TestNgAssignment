package org.example;

import org.testng.annotations.Test;

public class TestClass1 {
    @Test(groups = "A")
    public void cubeOfNumber(){
        int number=3;
        System.out.println("Cube of a Number : "+number*number*number);
    }

    @Test(priority = 2)
    public void squareOfNumber(){
        int number=4;
        System.out.println("Square of a Number : "+number*number);
    }
    @Test(groups = "A")
    public void areaOfRectangle(){
        int length=2;
        int breadth=5;
        System.out.println("Area of Square : "+length*breadth);
    }
}
