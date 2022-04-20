package p3java;
import java.math.*;

import java.util.Scanner;

public class d3pair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,c=0;
		int a[]=new int[20];
		System.out.println("enter THE NUMBER OF ELEMENTS");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				
				if((Math.abs(a[i])-Math.abs(a[j]))==0) {
					
					if(a[i]!=0 && a[j]!=0) {
					c++;
					}
					a[j]=0;
				}
			}
		}
		System.out.println(c);

	}

}
