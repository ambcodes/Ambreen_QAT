package com.AssignmentDay;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_2 {
	public static void main(String[] args){
	ArrayList<String> a = new ArrayList<String>();
	Scanner b = new Scanner(System.in); 
	System.out.print("enter the number of elements:");
	int c = b.nextInt();
	
	System.out.print("enter the elements:");
	for(int i=0;i<=c;i++) {
		String el = b.nextLine();
		a.add(el);
	}
	System.out.println("reversed list:");
	for(int i=a.size()-1;i>=0;i--){
		String currentEl = a.get(i);
		System.out.println(currentEl);

}
	}
}

