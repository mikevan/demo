package sightfulmw.demo1;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Loops L = new Loops();
        int[] z = new int[]{1, 2, 3, 4, 5};
    	
        System.out.println( "Hello World!");        
        L.forLoop(z);
        L.whileLoop(5);
        L.doWhile(5);
    }
}
