package com.tu.mathutil;

public class MathUtilLive {

    public static void main(String[] args) {
        
        System.out.println("expected 5! = 120;\t actual: " + new MathUtil().getFactorial(5));
        
        System.out.println("expected 6! = 720;\t actual: " + new MathUtil().getFactorial(6));
        
        System.out.println("expected 0! = 1;\t actual: " + new MathUtil().getFactorial(1)); 
        
        //System.out.println("expected -5! = nope; actual: " + new MathUtil().getFactorial(-5));        
    }
    
}
