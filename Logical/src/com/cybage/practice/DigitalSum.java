package com.cybage.practice;

public class DigitalSum {

	public static void main(String[] args) {
		// Digital Sum: 465 =4+6+5=15
		int n=456;
		int sum=0;
		
		while(n!=0){
			sum=sum+n%10;
			n=n/10;
	    }
		System.out.println(sum);

	}

}
