package com.eraisuithon.UVa;

import java.util.Scanner;

class UVa11172 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		for (int j = 0; j < i; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a < b) {
				System.out.println("<");
			} else if (b < a) {
				System.out.println(">");
			} else {
				System.out.println("=");
			}
		}
		sc.close();
	}
}
