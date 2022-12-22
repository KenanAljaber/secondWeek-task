package com.task.main;

public class B {

	private Double a;
	private Double b;
	private String c;
	
	
	
	
	public B() {
		
	}
	public B(Double a, Double b, String c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Double getA() {
		return a;
	}
	public void setA(Double a) {
		this.a = a;
	}
	public Double getB() {
		return b;
	}
	public void setB(Double b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
	
}
