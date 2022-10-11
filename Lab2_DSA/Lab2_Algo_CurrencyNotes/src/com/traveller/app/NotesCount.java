package com.traveller.app;

public class NotesCount {
	public void counting(int[] currency, int amount) {
		int[] noteQty = new int[currency.length];
		int i;
		int sum = 0;
		for (i = 0; i < currency.length; i++) {
			noteQty[i] = amount / currency[i];
			sum = sum + noteQty[i];
			amount = amount % currency[i];
		}
		for (i = 0; i < currency.length; i++) {
			if (noteQty[i] != 0)
				System.out.println(currency[i] + "X" + noteQty[i]);
		}
	}

}
