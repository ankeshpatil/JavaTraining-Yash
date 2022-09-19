package com.yash.exception.task4;

import com.yash.exception.custom.InputException;
import com.yash.exception.custom.ItemPurchaseLimitExceed;

public class TestMain4 {
	public static void main(String[] args) {

		ItemAddition itemAddition = new ItemAddition();

		itemAddition.addItems();
		try {
			itemAddition.purchaseItems();
		} catch (InputException e) {
			
			e.printStackTrace();
		} catch (ItemPurchaseLimitExceed e) {
			
			e.printStackTrace();
		}

	}

}
