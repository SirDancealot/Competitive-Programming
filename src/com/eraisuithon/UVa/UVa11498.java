package com.eraisuithon.UVa;

import java.util.Scanner;

class UVa11498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x, y;
		int n, e;
		while (sc.hasNext() && k != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			while (k-- != 0) {
				n = sc.nextInt();
				e = sc.nextInt();
				
				if (x == n || y == e) {
					System.out.println("divisa");
				} else if (e > x) {
					if (n > y) {
						System.out.println("NE");
					} else {
						System.out.println("NO");
					}
				} else {
					if (n > y) {
						System.out.println("SE");
					} else {
						System.out.println("SO");
					}
				}
				
			}
			k = sc.nextInt();
		}
		sc.close();
	}
}
