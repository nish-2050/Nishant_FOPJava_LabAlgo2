package com.traveller.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of currency denominations of country");
		int size = sc.nextInt();

		int currency[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter the currency denominations " + (i+1));
			currency[i] = sc.nextInt();
		}
		SortCurrencyDenominations sortCur = new SortCurrencyDenominations();
		sortCur.sort(currency);

		System.out.println("Please enter how much payment you need to make");
		int amount = sc.nextInt();
		sc.close();

		NotesCount nc = new NotesCount();
		nc.counting(currency, amount);

	}
}
