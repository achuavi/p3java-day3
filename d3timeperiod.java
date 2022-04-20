package p3java;

import java.util.Scanner;

public class d3timeperiod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double t1m,t1s,t2m,t2s,tdiff,t1,t2,t;
		
		System.out.println("Enter the first time period minutes:\n");
		t1m=sc.nextDouble();
		System.out.println("Enter the first time period seconds:\n");
		t1s=sc.nextDouble();
		System.out.println("Enter the second time period minutes:\n");
		t2m=sc.nextDouble();
		System.out.println("Enter the second time period seconds:\n");
		t2s=sc.nextDouble();
		
		t1m=t1m*60.00;
		t2m=t2m*60.00;
		 
		t1=t1m+t1s;
		t2=t2m+t2s;
		
		tdiff=t1-t2;
		
		if(tdiff<0) {
			
			t=-1*(tdiff/3600);
		}
		else {
			t=(tdiff/3600);
		}
		System.out.println("The difference in hours is:"+t);
		
		

	}

}
