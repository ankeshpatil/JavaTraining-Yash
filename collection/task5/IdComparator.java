package com.yash.collection.task5;

import java.util.Comparator;

public class IdComparator implements Comparator<Items> {

	@Override
	public int compare(Items o1, Items o2) {

		if (o1.getItemId() == o2.getItemId())
			return 0;
		else if (o1.getItemId() < o2.getItemId())
			return 1;

		else
			return -1;

	}

}
