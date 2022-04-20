package p3java;

import java.util.Scanner;

public class d3arraydiaplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		int a[]=new int[20];
		System.out.println("enter THE NUMBER OF ELEMENTS");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		int mid,l = 0,r = 0;
		mid=(0+(n-1))/2;
		System.out.println(a[mid]+"\t");
		for(i=0,j=1;i<n && j<=n/2;i++,j++) {
			
			
			if((l-i)>=0) {
				l=mid-j;	
				System.out.println(a[l]+"\t");
			}
			if((r+i)<=n) {
				r=mid+j;
				System.out.println(a[r]+"\t");
			}
			}
			
			
		}
	}


