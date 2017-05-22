package sightfulmw.demo1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {    	
    	Loops L = new Loops();
        int[] z = new int[]{1, 2, 3, 4, 5};
        
        L.forLoop(z);
        L.whileLoop(5);
        L.doWhile(5);
        
        assertTrue( true );
    }
}
