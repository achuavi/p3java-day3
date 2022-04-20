package p3java;

import java.util.Scanner;

public class d3matrixmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int n,i,j,r,c,r1 = 0,c1,min,c2 = 0;
				int a[]=new int[20];
				System.out.println("enter THE no.of rows and columns");
				r=sc.nextInt();
				c=sc.nextInt();
				
				for(i=0;i<r*c;i++) {
					a[i]=sc.nextInt();
					
				}
				min=a[0];
				for(i=0;i<r*c;i++) {
					if(a[i]<min) {
						min=a[i];
						c2=i;
					}
				}
				System.out.println(c2);
				for(i=0;i<=c;i++) {	
			if(c2<i*c) {
				r1=i-1;
				break;
				
			}
				}
			c1=(c2%c);
			System.out.println("The small element is"+min);
			
			System.out.println("The row is"+r1+"\n Column is"+c1);	
	}

}
