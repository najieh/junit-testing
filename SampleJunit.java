import java.io.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Notes:
 * To run use this command -
 * javac -cp .:junit-4.11.jar:. SampleJunit.java && java -cp .:junit-4.11.jar:. SampleJunit
 * if Its in a different directory then instead of :. have :[directory]
 */

public class SampleJunit {

    /**
     * Main Method used for executing all the tests
     */
    public static void main(String[] args) {
        // PUT CLASS NAME In the string.
        org.junit.runner.JUnitCore.main("SampleJunit");
    }

    @Test(timeout = 10000)
    public void test1 () {
        assertEquals(10, Calculator.add(4,6));
    }   
    
    @Test(timeout = 10000)
    public void test2 () {
        assertTrue(36 == Calculator.multiply(6,6));
    }
    
    
}

