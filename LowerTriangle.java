package logic;

import java.util.Scanner;

public class LowerTriangle {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s1.nextInt();
		String[] a=new String[n];
		System.out.println("Enter strings");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextLine();
		}
		System.out.println("Anagrams are");
		for(int i=0;i<n;i++)
		{
			if(a[i].equals(a[i].toLowerCase()))
			{
				System.out.println(a[i]);
			}
		}

	}

}
}