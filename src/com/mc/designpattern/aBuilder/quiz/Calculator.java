package com.mc.designpattern.aBuilder.quiz;

public class Calculator {
	private int res;
	private int value;
	

    public Calculator(int res) {
		super();
		this.res = res;
	}


    public Calculator plus(int n) {
        this.res += n;
        return this; 
    }

    public Calculator minus(int n) {
        this.res -= n;
        return this; 
    }

    public int calculate() {
        return this.res;
    }
}
