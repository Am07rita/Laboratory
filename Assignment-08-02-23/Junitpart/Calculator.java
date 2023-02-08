package com.junit;
public class Calculator {
public int addition(int a,int b) {
	return a+b;
}
public int multiplication(int a,int b) {
	return a*b;
}
public int subtraction(int a,int b) {
	return a-b;
}
public int division(int a,int b) {
	return a/b;
}
public int factorial(int n) {
	int f=-1;
	for(int i=0;i<=n;i++) {
		f=f*i;
	}
	return n;
}
}
