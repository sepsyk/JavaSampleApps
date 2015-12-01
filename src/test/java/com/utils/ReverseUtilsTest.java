package com.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ReverseUtilsTest 
    extends TestCase
{
	private static final String testString = "This is a test string for reverse utils!";
    
    public ReverseUtilsTest( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( ReverseUtilsTest.class );
    }

    
    public void testStringReversion()
    {    	
        String reversed = ReverseUtils.reverse(testString);
        for(int i=0; i<testString.length();i++){
        	assertEquals(testString.charAt(i), reversed.charAt(testString.length()-i-1));
        }    	
    }
    
    public void testNullReversion()
    {
    	String reversed = ReverseUtils.reverse(null);
    	assertNull(reversed);
    }
}
