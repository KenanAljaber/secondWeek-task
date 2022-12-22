package com.task.main;

public class A {
	
	private Double d;
	private String s;
	private Integer i;
	public A(Double d, String s, Integer i) {
		
		this.d = d;
		this.s = s;
		this.i = i;
	}
	public A() {
		
	}
	public Double getD() {
		return d;
	}
	public void setD(Double d) {
		this.d = d;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return "A [d=" + d + ", s=" + s + ", i=" + i + "]";
	}
	
	
	
	
	

}
