package org.example;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass2 {


    @BeforeSuite
    public void beforeSuiteExample(){
        System.out.println("This is Before Suite");
    }
    @Test(groups = "A")
    public void testCase1(){
        System.out.println("This is Test Case 1");
    }
    @Test(priority = 3)
    public void testCase2(){
        System.out.println("This is Test Case 2");;
    }
    @Test(priority = 1)
    public void testCase3(){
        System.out.println("This is Test Case 3");

    }



}
