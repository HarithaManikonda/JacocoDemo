package jacoco.JacocoDemo;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

 
public class HelloWorldTest {
 
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }
 
    @Before
    public void before() {
        System.out.println("Before Test Case");
    }
 
    @Test
    public void isGreaterTest() {
    	int i;
        System.out.println("Test");
        HelloWorld helloWorld = new  HelloWorld();
        
        assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
    }
    @Test
    public void isGreaterTest2() {
    	int j=10;
        System.out.println("Test");
        HelloWorld helloWorld = new  HelloWorld();
        
        assertFalse("Num 1 is greater than Num 2", helloWorld.isGreater(2, 3));
    }
 
    @After
    public void after() {
        System.out.println("After Test Case");
    }
 
    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}