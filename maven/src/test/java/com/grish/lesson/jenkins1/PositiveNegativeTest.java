package com.grish.lesson.jenkins1;

import org.junit.*;

public class PositiveNegativeTest {

    @Test
    public void testCheckSignShouldReturnPositive() {
    	PositiveNegativeTest sm = new PositiveNegativeTest();
        Assert.assertEquals("positive", sm.checkSign(5));
        Assert.assertEquals("positive", sm.checkSign(0));
        
    }
    
    private String checkSign(int number) {
		// TODO Auto-generated method stub
    	if(number >= 0 ) {
            return "positive";
        } else {
            return "negative";
        }
    }
    	

	@Test
    public void testCheckSignShouldReturnNegative() {
    	PositiveNegativeTest sm = new PositiveNegativeTest();
        Assert.assertEquals("negative", sm.checkSign(-5));
    }

}