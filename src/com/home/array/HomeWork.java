package com.home.array;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    int[] a = new int[5];
	    int[] b = new int[5];
	    for(int i =0;i<a.length;i++){
	      System.out.println("Enter the value of a["+i+"]");
	      a[i] = s.nextInt();
	    }
	    int j = 0;
	    for(int i = b.length-1;i>=0;i--){
	      b[i] = a[j];
	      j++;
	    }
	    for(int i = 0; i< b.length; i++){
	      System.out.println("The value of b["+i+"] is "+b[i]);
	    }
	}

}
