//1. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
//		짝수합 : 2550
//		홀수합 : 2500
//		합 : 5050
package com.day3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int i = 1, sum1, sum2;
		
		sum1=0;
		sum2=0;
		//while문 사용
		while(i<100) {
			sum1 += i++; //홀수 합
			sum2 += i++; //짝수 합
		}
		
		System.out.println("짝수합 : " + sum2);
		System.out.println("홀수합 : " + sum1);
		System.out.println("전체 합 : " + (sum1+sum2));
	}

	public static class Q1_1 {

		public static void main(String[] args) {

			int i = 1, sum1, sum2;

			sum1=0;
			sum2=0;
			//do-while문
			do {
				sum1 += i++; 
				sum2 += i++; 
			} while(i<100);

			System.out.println("짝수의 합 : " + sum2);
			System.out.println("홀수의 합 : " + sum1);
			System.out.println("전체 합 : " + (sum1+sum2));
		}

	}
}