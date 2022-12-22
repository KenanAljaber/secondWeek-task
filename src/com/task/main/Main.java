package com.task.main;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		A objA=new A(1.5,"Object A",3);
		//declaring the function that will convert from A to B
		Function<A,B> convertToB= (obj)->{
			return new B(obj.getD(),Double.valueOf(obj.getI()),obj.getS());
		};
		//getting the converted object
		B b=convertAToB(objA, convertToB);
		System.out.println("Object a "+objA);
		System.out.println("object b "+b);
		System.out.println("--------------------------------------------------------------");
		//-------------------------------------------------
		//converting from B to A
		B objB=new B(1.5,2.5,"Object b");
		
		Function<B,A> convertToA= (obj)->{
			return new A(obj.getA(),obj.getC(),obj.getB().intValue());
		};
		A a=convertBToA(objB, convertToA);
		System.out.println("Object a "+objB);
		System.out.println("object b "+a);

	}
	
	public static B convertAToB(A objA,Function<A,B> converterFunciton) {
			return converterFunciton.apply(objA);
	}
	public static A convertBToA(B objB,Function<B,A> converterFunciton) {
		return converterFunciton.apply(objB);
}
	
	

}
