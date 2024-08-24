package com.nologic.problemsolving.arrays;

import java.util.*;

/**
 * 
 * @author deepakkar
 * program to find the max and min in an array
 */
class Array1 {
	public static void main(String[] args) {
		int a[] = { 1, 423, 6, 46, 34, 23, 13, 53, 4 };

		// Implemented inbuilt function to sort array
		Arrays.sort(a);

		// after sorting the value at 0th position will minimum and
		// nth position will be maximum
		System.out.println("min-" + a[0] + " max-" + a[a.length - 1]);
	}
	
}