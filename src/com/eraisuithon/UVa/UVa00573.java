package com.eraisuithon.UVa;

import java.util.Scanner;

public class UVa00573 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float H, U, D, F, height;
		int day;
		boolean sucess;
		H = sc.nextInt();
		U = sc.nextInt();
		D = sc.nextInt();
		F = sc.nextInt();
		while (H != 0) {
			day = 0;
			height = 0;
			float loss = (F / 100F) * U;
			
			while (true) {
				day++;
				height += U;
				height -= Math.min(U, (loss * (day - 1)));
				
				if (height > H) {
					sucess = true;
					break;
				}
				height -= D;
				if (height < 0) {
					sucess = false;
					break;
				}
			}
			if (sucess) {
				System.out.println("success on day " + String.valueOf(day));
			} else {
				System.out.println("failure on day " + String.valueOf(day));
			}
			
			
			
			H = sc.nextInt();
			U = sc.nextInt();
			D = sc.nextInt();
			F = sc.nextInt();
		}
		sc.close();
	}
}
