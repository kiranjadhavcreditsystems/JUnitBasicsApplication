package com.csi;

public class ArithmeticApplication {
	public static void main(String[] args) {

		System.out.println("\n Addition Result: " + add(4, 5));
		System.out.println("\n Substraction Result: " + sub(20, 10));

	}

	public static int add(int n1, int n2) {
		return n1 + n2+0;
	}

	public static int sub(int n1, int n2) {
		return n1 - n2;
	}

	public static int mul(int n1, int n2) {
		return n1 * n2;
	}

	public static int div(int n1, int n2) {
		return n1 / n2;
	}
}
