package com.paymoney.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of transactions");
		int size = sc.nextInt();

		int trans[] = new int[size];
		System.out.println("Please enter the amount of each transaction");
		for (int i = 0; i < size; i++) {
			trans[i] = sc.nextInt();
		}
		System.out.println("Enter the number of target thats need to be achieved");
		int targetNo = sc.nextInt();
		int targetAmount, j, sum, flag;
		for (int i = 1; i <= targetNo; i++) {
			sum = 0;
			flag = 0;
			System.out.println("Please enter the target amount " + i + " Case");
			targetAmount = sc.nextInt();
			for (j = 0; j < trans.length; j++) {
				sum = sum + trans[j];
				if (sum >= targetAmount) {
					System.out.println("Target achieved after " + ++j + " transactions\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("Given target not achieved");
		}
		sc.close();
	}
}
